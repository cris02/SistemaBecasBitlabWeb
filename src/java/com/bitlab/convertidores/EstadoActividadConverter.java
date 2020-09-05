/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.convertidores;

import com.bitlab.controladores.EstActividadControlador;
import com.bitlab.entidades.EstActividad;
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

@FacesConverter("estadoActividadConverter")
public class EstadoActividadConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        try {
            EstActividadControlador estActividadControlador = new EstActividadControlador();
            return estActividadControlador.encontrar(Integer.parseInt(string));
        } catch (Exception ex) {
            Logger.getLogger(EstadoActividadConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        return ((EstActividad) o).getEstActIdPk().toString();
    }
    
}
