/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.manejadores;

import com.bitlab.controladores.AlumnoControlador;
import com.bitlab.controladores.DetAluTareaControlador;
import com.bitlab.controladores.TareaControlador;
import com.bitlab.entidades.Alumno;
import com.bitlab.entidades.DetAluTarea;
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

public class DetAluTareaManejador extends ManejadorAbstracto<DetAluTarea> {

    private final DetAluTareaControlador detAluTareaControlador;
    private final AlumnoControlador alumnoControlador;
    private final TareaControlador tareaControlador;
    private  List<Alumno> listAlumno;
    private  List<Tarea> listTarea;

    public DetAluTareaManejador() {
        super(DetAluTarea.class);
        detAluTareaControlador = new DetAluTareaControlador();
        alumnoControlador = new AlumnoControlador();
        tareaControlador = new TareaControlador();
        listAlumno = alumnoControlador.encontrarEntidades();
        listTarea = tareaControlador.encontrarEntidades();
    }

    @Override
    public DetAluTareaControlador obtenerControlador() {
        return detAluTareaControlador;
    }

    public List<Alumno> getListAlumno() {
        return listAlumno;
    }

    public void setListAlumno(List<Alumno> listAlumno) {
        this.listAlumno = listAlumno;
    }

    public List<Tarea> getListTarea() {
        return listTarea;
    }

    public void setListTarea(List<Tarea> listTarea) {
        this.listTarea = listTarea;
    }
    

}
