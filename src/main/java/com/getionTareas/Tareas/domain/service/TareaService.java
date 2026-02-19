package com.getionTareas.Tareas.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.getionTareas.Tareas.domain.dto.TareaDto;
import com.getionTareas.Tareas.domain.repository.TareaRepository;

@Service
public class TareaService {
    private final TareaRepository tareaRepository;

    public TareaService(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    public List<TareaDto> getAll()
    {
        return this.tareaRepository.getAll();
    }

    public TareaDto getById(Integer id)
    {
        return this.tareaRepository.getById(id);
    }

}
