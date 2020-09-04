/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.manejadores;

import com.bitlab.controladores.CursoControlador;
import com.bitlab.controladores.EvaluadorControlador;
import com.bitlab.controladores.ProfesorControlador;
import com.bitlab.entidades.Curso;
import com.bitlab.entidades.Evaluador;
import com.bitlab.entidades.Profesor;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Aguilar
 */

@ManagedBean
@ViewScoped

public class CursoManejador extends ManejadorAbstracto<Curso>{
    
    private final CursoControlador cursoControlador;
    private final EvaluadorControlador evaluadorControlador;
    private final ProfesorControlador profesorControlador;
    private List<Evaluador> listEvaluadores;
    private List<Profesor> listProfesores;

    public CursoManejador() {
        super(Curso.class);
        cursoControlador = new CursoControlador();
        evaluadorControlador = new EvaluadorControlador();
        profesorControlador = new ProfesorControlador();
        listEvaluadores = evaluadorControlador.encontrarEntidades();
        listProfesores = profesorControlador.encontrarEntidades();
    }

    @Override
    public CursoControlador obtenerControlador() {
        return cursoControlador;
    }

    public List<Evaluador> getListEvaluadores() {
        return listEvaluadores;
    }

    public void setListEvaluadores(List<Evaluador> listEvaluadores) {
        this.listEvaluadores = listEvaluadores;
    }

    public List<Profesor> getListProfesores() {
        return listProfesores;
    }

    public void setListProfesores(List<Profesor> listProfesores) {
        this.listProfesores = listProfesores;
    }
    
}
