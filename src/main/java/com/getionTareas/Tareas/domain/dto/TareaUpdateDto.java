package com.getionTareas.Tareas.domain.dto;

import com.getionTareas.Tareas.domain.Estado;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record TareaUpdateDto(
    @NotBlank(message = "La descripcion es obligatoria")
    @Size(min = 7, message = "La descripción necesita mas de 7 caracteres")
    String description,

    @NotNull(message = "El Estoado es obigatorio (Completada/Incompleta)")
    Estado estat
) {

}
