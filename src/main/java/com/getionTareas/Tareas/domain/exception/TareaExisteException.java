package com.getionTareas.Tareas.domain.exception;

public class TareaExisteException extends RuntimeException{
    public TareaExisteException(){
        super("La Tarea no Existe");
    }

}
