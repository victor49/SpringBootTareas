package com.getionTareas.Tareas.domain.dto;

import java.time.LocalDate;

import com.getionTareas.Tareas.domain.Estado;

public record TareaDto(
    String title,
    String description,
    Estado estat,
    LocalDate termin
) {

}
