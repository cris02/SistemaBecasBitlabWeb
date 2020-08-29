/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.manejadores;

import com.bitlab.controladores.AlumnoControlador;
import com.bitlab.controladores.FabricaControladorAbstracto;
import com.bitlab.entidades.Alumno;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author henry
 */
@ManagedBean
@ViewScoped
public class AlumnoManejador extends ManejadorAbstracto<Alumno>{
    private AlumnoControlador alumnoControlador;
    
    public AlumnoManejador(){
        super(Alumno.class);
        alumnoControlador = new AlumnoControlador();
    }

    @Override
    public FabricaControladorAbstracto<Alumno> obtenerControlador() {
        return alumnoControlador;
    }
    
}
