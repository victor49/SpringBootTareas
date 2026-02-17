package com.getionTareas.Tareas.web.controller;

import org.springframework.web.bind.annotation.RestController;

import com.getionTareas.Tareas.domain.dto.TareaDto;
import com.getionTareas.Tareas.domain.service.TareaAiService;
import com.getionTareas.Tareas.persistence.crud.CrudTareaEntity;
import com.getionTareas.Tareas.persistence.entity.TareaEntity;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class TareaController {
    private final TareaAiService TareaService;

    public TareaController(TareaAiService tareaService) {
        TareaService = tareaService;
    }

    @GetMapping()
    public List<TareaDto> getAll() {
        return this.TareaService.getAll();
    }
    




}
