package com.getionTareas.Tareas.web.controller;

import org.springframework.web.bind.annotation.RestController;

import com.getionTareas.Tareas.domain.service.TareaAiService;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {

    private final TareaAiService aiService;

    public HelloController(TareaAiService aiService)
    {
        this.aiService = aiService;
    }

    @GetMapping("/hello")
    public String hello() {
        return this.aiService.generarMensaje(); //utilizar IA para generar el mesaje 
        //return "Hello";
    }
    

}
