package com.getionTareas.Tareas.domain.dto;

import java.time.LocalDate;

public record TareaDto(
    String title,
    String description,
    Boolean estat,
    LocalDate termin
) {

}
