/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.manejadores;

import com.bitlab.controladores.DetPerTecnologiaControlador;
import com.bitlab.controladores.PerfilControlador;
import com.bitlab.controladores.TecnologiaControlador;
import com.bitlab.entidades.DetPerTecnologia;
import com.bitlab.entidades.Perfil;
import com.bitlab.entidades.Tecnologia;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Aguilar
 */

@ManagedBean
@ViewScoped

public class DetPerTecnologiaManejador extends ManejadorAbstracto<DetPerTecnologia>{
    
    private final DetPerTecnologiaControlador detPerTecnologiaControlador;
    private final PerfilControlador perfilControlador;
    private final TecnologiaControlador tecnologiaControlador;
    private  List<Perfil> listPerfiles;
    private  List<Tecnologia> listTecnologias;

    public DetPerTecnologiaManejador() {
        super(DetPerTecnologia.class);
        detPerTecnologiaControlador = new DetPerTecnologiaControlador();
        perfilControlador = new PerfilControlador();
        tecnologiaControlador = new TecnologiaControlador();
        listPerfiles = perfilControlador.encontrarEntidades();
        listTecnologias =tecnologiaControlador.encontrarEntidades();
    }

    @Override
    public DetPerTecnologiaControlador obtenerControlador() {
        return detPerTecnologiaControlador;
    }

    public List<Perfil> getListPerfiles() {
        return listPerfiles;
    }

    public void setListPerfiles(List<Perfil> listPerfiles) {
        this.listPerfiles = listPerfiles;
    }

    public List<Tecnologia> getListTecnologias() {
        return listTecnologias;
    }

    public void setListTecnologias(List<Tecnologia> listTecnologias) {
        this.listTecnologias = listTecnologias;
    }    
    
}
