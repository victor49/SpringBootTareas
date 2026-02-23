package com.getionTareas.Tareas.web.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
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

    // Validaciones de Entitys
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<Error>> haldleException(MethodArgumentNotValidException ex){
        
        List<Error> errores = new ArrayList<>();

        ex.getBindingResult().getFieldErrors().forEach( error -> {
            errores.add(new Error(error.getField(), error.getDefaultMessage()));
        });

        return ResponseEntity.badRequest().body(errores);
    }

    // Excepciones Generales 
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Error> handleException(Exception ex){
        Error error = new Error("error-desconocido", ex.getMessage());

        return ResponseEntity.badRequest().body(error);  
    }

}
