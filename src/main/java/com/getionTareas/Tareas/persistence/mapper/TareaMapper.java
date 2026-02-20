package com.getionTareas.Tareas.persistence.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.getionTareas.Tareas.domain.dto.TareaDto;
import com.getionTareas.Tareas.domain.dto.TareaInsertDto;
import com.getionTareas.Tareas.persistence.entity.TareaEntity;

@Mapper(componentModel = "spring", uses = {EstodoMapper.class})
public interface TareaMapper {
    //Mapear
    //                  Entity             Dto
    @Mapping(source = "tareaId", target = "id")
    @Mapping(source = "titulo", target = "title")
    @Mapping(source = "descripcion", target = "description")
    @Mapping(source = "estado", target = "estat", qualifiedByName = "booleanToEstdo")
    @Mapping(source = "fechaLimite", target = "termin")
    
    //   Convertir un Entity en un Dto
    //Para mapear un solo objeto
    TareaDto toDto(TareaEntity entity);

    //Para maepar una lista de objetos
    List<TareaDto> toDto(Iterable<TareaEntity> entities);

    //   Invertir los Mapping y converitr un Dto a un entity Si tulizamos TareaDto
    /*@InheritInverseConfiguration   
    @Mapping(source = "estat", target = "estado", qualifiedByName = "estodoToBoolena")
    TareaEntity toEntity(TareaDto tareaDto);
    */

    //Convertir InsertDto a entity
    @Mapping(source = "title", target = "titulo")
    @Mapping(source = "description", target = "descripcion")
    @Mapping(source = "estat", target = "estado", qualifiedByName = "estodoToBoolena")
    @Mapping(source = "termin", target = "fechaLimite")
    TareaEntity toEntity(TareaInsertDto tareaInsertDto);
}
