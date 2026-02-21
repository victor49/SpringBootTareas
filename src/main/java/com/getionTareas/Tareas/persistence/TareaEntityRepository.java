package com.getionTareas.Tareas.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.getionTareas.Tareas.domain.dto.TareaDto;
import com.getionTareas.Tareas.domain.dto.TareaInsertDto;
import com.getionTareas.Tareas.domain.dto.TareaUpdateDto;
import com.getionTareas.Tareas.domain.exception.TareaExisteException;
import com.getionTareas.Tareas.domain.repository.TareaRepository;
import com.getionTareas.Tareas.persistence.crud.CrudTareaEntity;
import com.getionTareas.Tareas.persistence.entity.TareaEntity;
import com.getionTareas.Tareas.persistence.mapper.TareaMapper;

@Repository
public class TareaEntityRepository implements TareaRepository{
    private final CrudTareaEntity crudTareaEntity;
    private final TareaMapper tareaMapper;

    public TareaEntityRepository(CrudTareaEntity crudTareaEntity, TareaMapper tareaMapper) {
        this.crudTareaEntity = crudTareaEntity;
        this.tareaMapper = tareaMapper;
    }

    @Override
    public List<TareaDto> getAll() {
        return this.tareaMapper.toDto(this.crudTareaEntity.findAll());
    }

    @Override
    public TareaDto getById(Integer id) {
        TareaEntity tareaEntity = this.crudTareaEntity.findById(id).orElse(null);

        if (tareaEntity == null)
            throw new TareaExisteException();

        return this.tareaMapper.toDto(tareaEntity);
    }

    @Override
    public TareaDto save(TareaInsertDto tareaInsertDto) {
        TareaEntity tareaEntity = this.tareaMapper.toInserDtoEntity(tareaInsertDto);

        return this.tareaMapper.toDto(this.crudTareaEntity.save(tareaEntity));
    }

    @Override
    public TareaDto update(Integer id, TareaUpdateDto tareaUpdateDto){
        TareaEntity tareaEntity = this.crudTareaEntity.findById(id).orElse(null);

        if (tareaEntity == null)
            throw new TareaExisteException();

        this.tareaMapper.updateEntityFromDto(tareaUpdateDto, tareaEntity);

        return this.tareaMapper.toDto(this.crudTareaEntity.save(tareaEntity));
    }

    @Override
    public TareaDto delete(Integer id) {       

        TareaEntity tareaEntity = this.crudTareaEntity.findById(id).orElse(null);

        if (tareaEntity == null)
            throw new TareaExisteException();

        this.crudTareaEntity.delete(tareaEntity);
        return this.tareaMapper.toDto(tareaEntity);
    }

}
