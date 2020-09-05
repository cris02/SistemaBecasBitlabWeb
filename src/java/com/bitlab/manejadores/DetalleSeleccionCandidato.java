/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.manejadores;

import com.bitlab.controladores.ActSeleccionControlador;
import com.bitlab.controladores.DetAluActseleccionControlador;
import com.bitlab.controladores.EstActividadControlador;
import com.bitlab.controladores.PerfilControlador;
import com.bitlab.entidades.ActSeleccion;
import com.bitlab.entidades.DetAluActseleccion;
import com.bitlab.entidades.EstActividad;
import com.bitlab.entidades.Perfil;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Aguilar
 */

@ManagedBean
@ViewScoped
public class DetalleSeleccionCandidato extends ManejadorAbstracto<DetAluActseleccion>{
    
    private final DetAluActseleccionControlador aluActseleccionControlador;
    private final EstActividadControlador estActividadControlador;
    private final ActSeleccionControlador actSeleccionControlador;
    private final PerfilControlador perfilControlador;
    
    private List<Perfil> listPerfil;
    private List<ActSeleccion> listActividadSelec;
    private List<EstActividad> listEstadoActividad;

    public DetalleSeleccionCandidato() {
        super(DetAluActseleccion.class);
        aluActseleccionControlador = new DetAluActseleccionControlador();
        estActividadControlador = new EstActividadControlador();
        actSeleccionControlador = new ActSeleccionControlador();
        perfilControlador = new PerfilControlador();
        listActividadSelec = actSeleccionControlador.encontrarEntidades();
        listEstadoActividad = estActividadControlador.encontrarEntidades();
        listPerfil = perfilControlador.filtrarPerfilPorEstado(1); // solo mostrara los perfiles de tipo candidato
    }

    @Override
    public DetAluActseleccionControlador obtenerControlador() {
        return aluActseleccionControlador;
    }

    public List<Perfil> getListPerfil() {
        return listPerfil;
    }

    public void setListPerfil(List<Perfil> listPerfil) {
        this.listPerfil = listPerfil;
    }

    public List<ActSeleccion> getListActividadSelec() {
        return listActividadSelec;
    }

    public void setListActividadSelec(List<ActSeleccion> listActividadSelec) {
        this.listActividadSelec = listActividadSelec;
    }

    public List<EstActividad> getListEstadoActividad() {
        return listEstadoActividad;
    }

    public void setListEstadoActividad(List<EstActividad> listEstadoActividad) {
        this.listEstadoActividad = listEstadoActividad;
    }
    
}
