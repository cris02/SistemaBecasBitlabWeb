/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.manejadores;

import com.bitlab.controladores.EvaluadorControlador;
import com.bitlab.controladores.UsuarioControlador;
import com.bitlab.entidades.Evaluador;
import com.bitlab.entidades.Usuario;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Aguilar
 * Este manejador trabaja con la tabla EVALUADOR
 */

@ManagedBean
@ViewScoped

public class EvaluadorManejador extends ManejadorAbstracto<Evaluador>{
    
    private final EvaluadorControlador evaluadorControlador;
    private final UsuarioControlador usuarioControlador;
    private List<Usuario> listUsuarios;

    public EvaluadorManejador() {
        super(Evaluador.class);
        evaluadorControlador = new EvaluadorControlador();
        usuarioControlador = new UsuarioControlador();
        listUsuarios = usuarioControlador.filtrarUsuariosPorRol(1, 3); //filtrar por rol 1 y 3
    }

    @Override
    public EvaluadorControlador obtenerControlador() {
       return evaluadorControlador;
    }

    public List<Usuario> getListUsuarios() {
        return listUsuarios;
    }

    public void setListUsuarios(List<Usuario> listUsuarios) {
        this.listUsuarios = listUsuarios;
    }
    
}
