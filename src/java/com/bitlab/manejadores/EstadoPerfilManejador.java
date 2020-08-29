/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.manejadores;

import com.bitlab.controladores.EstPerfilControlador;
import com.bitlab.entidades.EstPerfil;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Aguilar
 */

@ManagedBean
@ViewScoped

public class EstadoPerfilManejador extends ManejadorAbstracto<EstPerfil>{
    
    private EstPerfilControlador estadoPerfilControlador;

    public EstadoPerfilManejador() {
        super(EstPerfil.class);
        estadoPerfilControlador = new EstPerfilControlador();
    }

    @Override
    public EstPerfilControlador obtenerControlador() {
        return estadoPerfilControlador;
    }
    
}
