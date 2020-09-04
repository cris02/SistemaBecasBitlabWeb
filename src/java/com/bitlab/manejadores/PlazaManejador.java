/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.manejadores;

import com.bitlab.controladores.EvaluadorControlador;
import com.bitlab.controladores.FabricaControladorAbstracto;
import com.bitlab.controladores.PlazaControlador;
import com.bitlab.entidades.Evaluador;
import com.bitlab.entidades.Plaza;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;

/**
 *
 * @author henry
 */
@ManagedBean
@SessionScoped
public class PlazaManejador extends ManejadorAbstracto<Plaza>{
    private final PlazaControlador plazaControlador;
    private final EvaluadorControlador evaluadorControlador;
    private List<Evaluador> evaluadorLista;
    /**
     * Creates a new instance of PlazaManejador
     */
    public PlazaManejador() {
        super(Plaza.class);
        plazaControlador = new PlazaControlador();
        evaluadorControlador = new EvaluadorControlador();
        evaluadorLista = evaluadorControlador.encontrarEntidades();
    }

    @Override
    public PlazaControlador obtenerControlador() {
        return plazaControlador;
    }

    public List<Evaluador> getEvaluadorLista() {
        return evaluadorLista;
    }

    public void setEvaluadorLista(List<Evaluador> evaluadorLista) {
        this.evaluadorLista = evaluadorLista;
    }
    
    
}
