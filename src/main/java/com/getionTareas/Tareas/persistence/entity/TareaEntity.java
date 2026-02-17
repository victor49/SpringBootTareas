package com.getionTareas.Tareas.persistence.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tareas")
public class TareaEntity {  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Integer tareaId;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private Boolean estado;
    
    @Column(name = "fecha_limite")
    private LocalDate fechaLimite;


    public Integer getTareaId() {
        return tareaId;
    }
    public void setTareaId(Integer tareaId) {
        this.tareaId = tareaId;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Boolean getEstado() {
        return estado;
    }
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public LocalDate getFechaLimite() {
        return fechaLimite;
    }
    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }


    
}
