/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.manejadores;

import com.bitlab.controladores.AlumnoControlador;
import com.bitlab.controladores.FabricaControladorAbstracto;
import com.bitlab.controladores.UsuarioControlador;
import com.bitlab.entidades.Alumno;
import com.bitlab.entidades.Usuario;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author henry
 */
@ManagedBean
@ViewScoped

public class AlumnoManejador extends ManejadorAbstracto<Alumno>{
    
    private final AlumnoControlador alumnoControlador;
    private final UsuarioControlador usuarioControlador;
    private List<Usuario> listUsuario;
    
    public AlumnoManejador(){
        super(Alumno.class);
        alumnoControlador = new AlumnoControlador();
        usuarioControlador = new UsuarioControlador();
        listUsuario = usuarioControlador.encontrarEntidades();
    }

    @Override
    public FabricaControladorAbstracto<Alumno> obtenerControlador() {
        return alumnoControlador;
    }

    public List<Usuario> getListUsuario() {
        return listUsuario;
    }

    public void setListUsuario(List<Usuario> listUsuario) {
        this.listUsuario = listUsuario;
    }      
    
}
