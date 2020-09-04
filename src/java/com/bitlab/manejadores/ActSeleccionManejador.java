package com.bitlab.manejadores;

import com.bitlab.controladores.ActSeleccionControlador;
import com.bitlab.controladores.CursoControlador;
import com.bitlab.controladores.EvaluadorControlador;
import com.bitlab.controladores.FabricaControladorAbstracto;
import com.bitlab.entidades.ActSeleccion;
import com.bitlab.entidades.Curso;
import com.bitlab.entidades.Evaluador;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author henry
 */
@ManagedBean
@ViewScoped
public class ActSeleccionManejador extends ManejadorAbstracto<ActSeleccion>{
    private final ActSeleccionControlador actSeleccionControlador;
    private final CursoControlador cursoControlador;
    private final EvaluadorControlador evaluadorControlador;
    private List<Curso> listCursos;
    private List<Evaluador> listEvaluadores;
    
    
    public ActSeleccionManejador(){
        super(ActSeleccion.class);
        actSeleccionControlador = new ActSeleccionControlador();
        cursoControlador = new CursoControlador();
        evaluadorControlador = new EvaluadorControlador();
        listCursos = cursoControlador.encontrarEntidades();
        listEvaluadores = evaluadorControlador.encontrarEntidades();
    }

    @Override
    public FabricaControladorAbstracto<ActSeleccion> obtenerControlador() {
        return actSeleccionControlador;
    }    
    

    public List<Curso> getListCursos() {
        return listCursos;
    }

    public void setListCursos(List<Curso> listCursos) {
        this.listCursos = listCursos;
    }

    public List<Evaluador> getListEvaluadores() {
        return listEvaluadores;
    }

    public void setListEvaluadores(List<Evaluador> listEvaluadores) {
        this.listEvaluadores = listEvaluadores;
    }
    
    
    
}