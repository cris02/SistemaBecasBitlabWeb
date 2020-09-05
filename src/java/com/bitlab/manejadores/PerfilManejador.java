/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.manejadores;

import com.bitlab.controladores.AlumnoControlador;
import com.bitlab.controladores.EstPerfilControlador;
import com.bitlab.controladores.FabricaControladorAbstracto;
import com.bitlab.controladores.PerfilControlador;
import com.bitlab.entidades.Alumno;
import com.bitlab.entidades.EstPerfil;
import com.bitlab.entidades.Perfil;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.util.List;
import org.primefaces.model.file.UploadedFile;
import java.io.*;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import org.primefaces.event.FileUploadEvent;

/**
 *
 * @author henry
 */
@ManagedBean
@ViewScoped
public class PerfilManejador extends ManejadorAbstracto<Perfil> {
    private PerfilControlador perfilControlador;
    private EstPerfilControlador estadoPerfilControlador;
    private AlumnoControlador alumnoControlador;
    private List<Alumno> alumnoLista;
    private List<EstPerfil> estadoPerfilLista;
    private String rutaImagen = "";

    public PerfilManejador() {
        super(Perfil.class);
        perfilControlador = new PerfilControlador();
        estadoPerfilControlador = new EstPerfilControlador();
        alumnoControlador = new AlumnoControlador();
        estadoPerfilLista = estadoPerfilControlador.encontrarEntidades();
        alumnoLista = alumnoControlador.encontrarEntidades();
    }

    public void manejarArchivo(FileUploadEvent evento) {
        UploadedFile archivo = evento.getFile();
        byte[] contenidoBytes = archivo.getContent();
        
        
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        rutaImagen = ec.getRealPath("/");
        rutaImagen = rutaImagen + File.separator + "images" + File.separator + archivo.getFileName();
        try {
//            InputStream in = archivo.getInputStream();
            //FileOutputStream out = new FileOutputStream(rutaImagen);          
            
            //out.write(contenidoBytes);
            //out.close();
            //System.out.println("Ruta Imagen: " +rutaImagen);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public List<Alumno> getAlumnoLista() {
        return alumnoLista;
    }

    public List<EstPerfil> getEstadoPerfilLista() {
        return estadoPerfilLista;
    }

    @Override
    public FabricaControladorAbstracto<Perfil> obtenerControlador() {
        return perfilControlador;
    }
}
