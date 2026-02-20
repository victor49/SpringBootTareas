package com.getionTareas.Tareas.domain.dto;

import com.getionTareas.Tareas.domain.Estado;

public record TareaUpdateDto(
    String description,
    Estado estat
) {

}
