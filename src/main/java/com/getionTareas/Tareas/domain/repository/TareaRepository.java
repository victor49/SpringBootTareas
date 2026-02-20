package com.getionTareas.Tareas.domain.repository;

import java.util.List;

import com.getionTareas.Tareas.domain.dto.TareaDto;
import com.getionTareas.Tareas.domain.dto.TareaInsertDto;
import com.getionTareas.Tareas.domain.dto.TareaUpdateDto;

public interface TareaRepository {
    List<TareaDto> getAll(); 
    TareaDto getById(Integer id);
    TareaDto save(TareaInsertDto tareaInsertDto);
    TareaDto update(Integer id, TareaUpdateDto tareaUpdateDto);
    TareaDto delete(Integer id);

}
