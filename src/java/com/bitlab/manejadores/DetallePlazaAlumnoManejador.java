/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.manejadores;

import com.bitlab.controladores.DetPlaAlumnoControlador;
import com.bitlab.controladores.EstPlazaControlador;
import com.bitlab.controladores.PerfilControlador;
import com.bitlab.controladores.PlazaControlador;
import com.bitlab.entidades.DetPlaAlumno;
import com.bitlab.entidades.EstPlaza;
import com.bitlab.entidades.Perfil;
import com.bitlab.entidades.Plaza;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Aguilar
 */

@ManagedBean
@ViewScoped
public class DetallePlazaAlumnoManejador extends ManejadorAbstracto<DetPlaAlumno>{
    
    private final DetPlaAlumnoControlador detPlaAlumnoControlador;
    private final EstPlazaControlador estPlazaControlador;
    private final PlazaControlador plazaControlador;
    private final PerfilControlador perfilControlador;
    private List<Plaza> listPlaza;
    private List<EstPlaza> listEstPlaza;
    private List<Perfil> listPerfil;
    

    public DetallePlazaAlumnoManejador() {
        super(DetPlaAlumno.class);
        detPlaAlumnoControlador = new DetPlaAlumnoControlador();
        estPlazaControlador = new EstPlazaControlador();
        perfilControlador = new PerfilControlador();
        plazaControlador = new PlazaControlador();
        listEstPlaza = estPlazaControlador.encontrarEntidades();
        listPerfil = perfilControlador.filtrarPerfilPorEstado(3); //solo filtra los alumnos graduados
        listPlaza = plazaControlador.encontrarEntidades();
    }

    @Override
    public DetPlaAlumnoControlador obtenerControlador() {
        return detPlaAlumnoControlador;
    }

    public List<Plaza> getListPlaza() {
        return listPlaza;
    }

    public void setListPlaza(List<Plaza> listPlaza) {
        this.listPlaza = listPlaza;
    }

    public List<EstPlaza> getListEstPlaza() {
        return listEstPlaza;
    }

    public void setListEstPlaza(List<EstPlaza> listEstPlaza) {
        this.listEstPlaza = listEstPlaza;
    }

    public List<Perfil> getListPerfil() {
        return listPerfil;
    }

    public void setListPerfil(List<Perfil> listPerfil) {
        this.listPerfil = listPerfil;
    }
    
    
    
}
