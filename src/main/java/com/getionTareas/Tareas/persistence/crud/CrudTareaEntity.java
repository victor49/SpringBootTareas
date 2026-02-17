package com.getionTareas.Tareas.persistence.crud;

import org.springframework.data.repository.CrudRepository;

import com.getionTareas.Tareas.persistence.entity.TareaEntity;

public interface CrudTareaEntity extends CrudRepository<TareaEntity, Integer>{

}
