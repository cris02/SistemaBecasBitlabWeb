/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.manejadores;

import com.bitlab.controladores.EstActividadControlador;
import com.bitlab.entidades.EstActividad;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Aguilar
 */

@ManagedBean
@ViewScoped
public class EstadoActividadManejador extends ManejadorAbstracto<EstActividad>{
    
    private final EstActividadControlador estActividadControlador;

    public EstadoActividadManejador() {
        super(EstActividad.class);
        estActividadControlador = new EstActividadControlador();
    }

    @Override
    public EstActividadControlador obtenerControlador() {
        return estActividadControlador;
    }
    
}
