package com.getionTareas.Tareas.domain.dto;

import java.time.LocalDate;
import com.getionTareas.Tareas.domain.Estado;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

public record TareaInsertDto(
    @NotBlank(message = "El titulo es obligatorio")
    String title,

    @NotBlank(message = "La descripcion es obligatoria")
    @Size(min = 7, message = "La descripción necesita mas de 7 caracteres")
    String description,

    @NotNull(message = "El estado es obligatorio")
    Estado estat,

    @PastOrPresent(message = "La fecha no debe ser anterior a la fecha actual")
    LocalDate termin
) {

}
