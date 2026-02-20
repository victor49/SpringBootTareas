package com.getionTareas.Tareas.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.getionTareas.Tareas.domain.dto.TareaDto;
import com.getionTareas.Tareas.domain.dto.TareaInsertDto;
import com.getionTareas.Tareas.domain.dto.TareaUpdateDto;
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

    public TareaDto add(TareaInsertDto tareaInsertDto)
    {
        return this.tareaRepository.save(tareaInsertDto);
    }

    public TareaDto update(Integer id, TareaUpdateDto tareaUpdateDto)
    {
        return this.tareaRepository.update(id, tareaUpdateDto);
    }

    public TareaDto delete(Integer id)
    {
        return this.tareaRepository.delete(id);
    }

}
