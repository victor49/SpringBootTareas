package com.getionTareas.Tareas.domain.repository;

import java.util.List;

import com.getionTareas.Tareas.domain.dto.TareaDto;

public interface TareaRepository {
    List<TareaDto> getAll();

}
