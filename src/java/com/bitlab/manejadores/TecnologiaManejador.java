/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.manejadores;

import com.bitlab.controladores.FabricaControladorAbstracto;
import com.bitlab.controladores.TecnologiaControlador;
import com.bitlab.entidades.Tecnologia;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author henry
 */
@ManagedBean
@ViewScoped
public class TecnologiaManejador extends ManejadorAbstracto<Tecnologia>{
    private TecnologiaControlador tecnologiaControlador;
    
    public TecnologiaManejador(){
        super(Tecnologia.class);
        tecnologiaControlador = new TecnologiaControlador();
    }

    @Override
    public FabricaControladorAbstracto<Tecnologia> obtenerControlador() {
        return tecnologiaControlador;
    }
    
}
