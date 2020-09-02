/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.manejadores;

import com.bitlab.controladores.FabricaControladorAbstracto;
import com.bitlab.controladores.PerfilControlador;
import com.bitlab.entidades.Perfil;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import org.primefaces.model.file.UploadedFile;
import java.io.*;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import org.primefaces.event.FileUploadEvent;

/**
 *
 * @author henry
 */
@ManagedBean
@SessionScoped
public class PerfilManejador extends ManejadorAbstracto<Perfil> {

    private PerfilControlador perfilControlador;
    private String rutaImagen = "";

    public PerfilManejador() {
        super(Perfil.class);
        perfilControlador = new PerfilControlador();
    }

    public void manejarArchivo(FileUploadEvent evento) {
        UploadedFile archivo = evento.getFile();
        byte[] contenidoBytes = archivo.getContent();
        
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        rutaImagen = ec.getRealPath("/");
        rutaImagen = rutaImagen + File.separator + "images" + File.separator + archivo.getFileName();

        try {
//            InputStream in = archivo.getInputStream();
            FileOutputStream out = new FileOutputStream(rutaImagen);
            
//            byte[] buffer = new byte[(int) archivo.getSize()];
//            int contador = 0;
            
            out.write(contenidoBytes);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public FabricaControladorAbstracto<Perfil> obtenerControlador() {
        return perfilControlador;
    }

    public PerfilControlador getPerfilControlador() {
        return perfilControlador;
    }

    public void setPerfilControlador(PerfilControlador perfilControlador) {
        this.perfilControlador = perfilControlador;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

}
