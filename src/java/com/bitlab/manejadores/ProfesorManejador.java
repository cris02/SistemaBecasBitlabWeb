/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.manejadores;

import com.bitlab.controladores.ProfesorControlador;
import com.bitlab.controladores.UsuarioControlador;
import com.bitlab.entidades.Profesor;
import com.bitlab.entidades.Usuario;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


/**
 *
 * @author Aguilar
 */

@ManagedBean
@ViewScoped

public class ProfesorManejador extends ManejadorAbstracto<Profesor>{

    private final ProfesorControlador profesorControlador;
    private final UsuarioControlador usuarioControlador;
//    private final List<Usuario> listUsuarios;
    
    public ProfesorManejador() {
        super(Profesor.class);
        profesorControlador = new ProfesorControlador();
        usuarioControlador = new UsuarioControlador();
    }

    @Override
    public ProfesorControlador obtenerControlador() {
        return profesorControlador;
    }

//    public List<Usuario> getListUsuarios() {
//        return listUsuarios;
//    }    
    
}
