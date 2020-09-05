/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.convertidores;

import com.bitlab.controladores.ActSeleccionControlador;
import com.bitlab.entidades.ActSeleccion;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Aguilar
 */

@FacesConverter("actividadSeleccionConverter")
public class ActividadSeleccionConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        try {
            ActSeleccionControlador actSeleccionControlador = new ActSeleccionControlador();
            return actSeleccionControlador.encontrar(Integer.parseInt(string));
        } catch (Exception ex) {
            Logger.getLogger(ActividadSeleccionConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        return ((ActSeleccion) o).getActSelIdPk().toString();
    }
    
}
