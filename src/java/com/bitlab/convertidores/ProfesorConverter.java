/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.convertidores;

import com.bitlab.controladores.ProfesorControlador;
import com.bitlab.entidades.Profesor;
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

@FacesConverter("profesorConverter")
public class ProfesorConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        try {
            ProfesorControlador profesorControlador = new ProfesorControlador();
            return profesorControlador.encontrar(Integer.parseInt(value));
        } catch (Exception ex) {
            Logger.getLogger(ProfesorConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return ((Profesor) value).getProIdPk().toString();
    }
    
}
