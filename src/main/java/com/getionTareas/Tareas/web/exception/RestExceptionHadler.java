package com.getionTareas.Tareas.web.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.getionTareas.Tareas.domain.exception.TareaExisteException;

@RestControllerAdvice
public class RestExceptionHadler {

    @ExceptionHandler(TareaExisteException.class)
    public ResponseEntity<Error> handleException(TareaExisteException ex){
        Error error = new Error("tarea-no-existe", ex.getMessage());
        return ResponseEntity.badRequest().body(error);
    }

}
