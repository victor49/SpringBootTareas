package com.getionTareas.Tareas.web.controller;

import org.springframework.web.bind.annotation.RestController;

import com.getionTareas.Tareas.domain.dto.TareaDto;
import com.getionTareas.Tareas.domain.dto.TareaInsertDto;
import com.getionTareas.Tareas.domain.dto.TareaUpdateDto;
import com.getionTareas.Tareas.domain.service.TareaService;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
@RequestMapping("/tareas")
@Tag(name = "Tareas", description = "Operaciones de las Tareas") //Nombre del controlador en el swagger
public class TareaController {
    private final TareaService tareaService;

    public TareaController(TareaService tareaService) {
        this.tareaService = tareaService;
    }

    @GetMapping()
    public ResponseEntity<List<TareaDto>> getAll() {
        
        return ResponseEntity.ok(this.tareaService.getAll());
 
    }
    

    @GetMapping("/{id}")
    public ResponseEntity<TareaDto> getById(@PathVariable Integer id)
    {
        TareaDto tareaDto = this.tareaService.getById(id);

        if (tareaDto == null)
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(tareaDto);
    }

    
    @PostMapping()
    public ResponseEntity<TareaDto> add(@RequestBody @Valid TareaInsertDto tareaInsertDto) {        
        TareaDto tareaDto = this.tareaService.add(tareaInsertDto);               
        return ResponseEntity.status(HttpStatus.CREATED).body(tareaDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TareaDto> update(@PathVariable Integer id, @Valid @RequestBody TareaUpdateDto tareaUpdateDto) {        
        return ResponseEntity.ok(this.tareaService.update(id, tareaUpdateDto));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<TareaDto> delete(@PathVariable Integer id){
        return ResponseEntity.ok(this.tareaService.delete(id));
    }

}
