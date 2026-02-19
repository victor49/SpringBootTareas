package com.getionTareas.Tareas.persistence.mapper;

import org.mapstruct.Named;

import com.getionTareas.Tareas.domain.Estado;

public class EstodoMapper {

    @Named("booleanToEstdo")
    public static Estado booleanToEstdo(boolean estado)
    {
        if(estado == true)
            return Estado.Completada;

        return Estado.Incompleta;
    }

    @Named("estodoToBoolena")
    public static boolean estodoToBoolena(Estado estado)
    {
        if (estado == estado.Completada)
            return  true;

        return false;
    }
}
