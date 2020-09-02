/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.manejadores;

import com.bitlab.controladores.ProfesorControlador;
import com.bitlab.controladores.TareaControlador;
import com.bitlab.entidades.Profesor;
import com.bitlab.entidades.Tarea;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Aguilar
 */

@ManagedBean
@ViewScoped

public class TareaManejador extends ManejadorAbstracto<Tarea>{
    
    private final TareaControlador tareaControlador;
    private final ProfesorControlador profesorControlador;
    private List<Profesor> listProfesores;

    public TareaManejador() {
        super(Tarea.class);
        tareaControlador = new TareaControlador();
        profesorControlador = new ProfesorControlador();
        listProfesores = profesorControlador.encontrarEntidades();
    }

    @Override
    public TareaControlador obtenerControlador() {
        return tareaControlador;
    }

    public List<Profesor> getListProfesores() {
        return listProfesores;
    }

    public void setListProfesores(List<Profesor> listProfesores) {
        this.listProfesores = listProfesores;
    }
    
}
