package com.getionTareas.Tareas.web.controller;

import org.springframework.web.bind.annotation.RestController;

import com.getionTareas.Tareas.domain.dto.TareaDto;
import com.getionTareas.Tareas.domain.service.TareaService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class TareaController {
    private final TareaService tareaService;

    public TareaController(TareaService tareaService) {
        this.tareaService = tareaService;
    }

    @GetMapping()
    public List<TareaDto> getAll() {
        return this.tareaService.getAll();
    }
    




}
