package com.getionTareas.Tareas;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {

    private final TareaAiService aiService;

    public HelloController(TareaAiService aiService)
    {
        this.aiService = aiService;
    }

    @GetMapping("/")
    public String hello() {
        //return this.aiService.generarMensaje(); utilizar IA para generar el mesaje 
        return "Hello";
    }
    

}
