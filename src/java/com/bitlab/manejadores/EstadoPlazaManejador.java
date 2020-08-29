/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.manejadores;

import com.bitlab.controladores.EstPlazaControlador;
import com.bitlab.controladores.FabricaControladorAbstracto;
import com.bitlab.entidades.EstPlaza;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Aguilar
 */

@ManagedBean
@ViewScoped

public class EstadoPlazaManejador extends ManejadorAbstracto<EstPlaza>{
    
    private EstPlazaControlador estadoPlazaControlador;

    public EstadoPlazaManejador() {
        super(EstPlaza.class);
        estadoPlazaControlador = new EstPlazaControlador();
    }

    @Override
    public EstPlazaControlador obtenerControlador() {
        return estadoPlazaControlador;
    }
    
}
