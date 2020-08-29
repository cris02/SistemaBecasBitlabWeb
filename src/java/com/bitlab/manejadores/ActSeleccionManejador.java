package com.bitlab.manejadores;

import com.bitlab.controladores.ActSeleccionControlador;
import com.bitlab.controladores.FabricaControladorAbstracto;
import com.bitlab.entidades.ActSeleccion;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author henry
 */
@ManagedBean
@ViewScoped
public class ActSeleccionManejador extends ManejadorAbstracto<ActSeleccion>{
    private ActSeleccionControlador actSeleccionControlador;
    
    public ActSeleccionManejador(){
        super(ActSeleccion.class);
        actSeleccionControlador = new ActSeleccionControlador();
    }

    @Override
    public FabricaControladorAbstracto<ActSeleccion> obtenerControlador() {
        return actSeleccionControlador;
    }
    
}