package com.getionTareas.Tareas.persistence.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.getionTareas.Tareas.domain.dto.TareaDto;
import com.getionTareas.Tareas.persistence.entity.TareaEntity;

@Mapper(componentModel = "spring", uses = {EstodoMapper.class})
public interface TareaMapper {
    //Mapear
    @Mapping(source = "titulo", target = "title")
    @Mapping(source = "descripcion", target = "description")
    @Mapping(source = "estado", target = "estat", qualifiedByName = "booleanToEstdo")
    @Mapping(source = "fechaLimite", target = "termin")
    
    //   Concertir un Entity en un Dto
    //Para mapear un solo objeto
    TareaDto toDto(TareaEntity entity);

    //Para maepar una lista de objetos
    List<TareaDto> toDto(Iterable<TareaEntity> entities);


}
