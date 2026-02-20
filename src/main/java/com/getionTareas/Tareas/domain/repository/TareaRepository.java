package com.getionTareas.Tareas.domain.repository;

import java.util.List;

import com.getionTareas.Tareas.domain.dto.TareaDto;
import com.getionTareas.Tareas.domain.dto.TareaInsertDto;

public interface TareaRepository {
    List<TareaDto> getAll(); 
    TareaDto getById(Integer id);
    TareaDto save(TareaInsertDto tareaInsertDto);

}
