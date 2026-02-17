package com.getionTareas.Tareas.domain.service;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface TareaAiService {

    @UserMessage("""
            Describe un mensaje corte de programador
            """)
    String generarMensaje();

}
