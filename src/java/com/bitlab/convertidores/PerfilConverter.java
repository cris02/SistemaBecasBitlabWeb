/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.convertidores;

import com.bitlab.controladores.PerfilControlador;
import com.bitlab.entidades.Perfil;
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

@FacesConverter("perfilConverter")
public class PerfilConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        try {
            PerfilControlador perfilControlador = new PerfilControlador();
            return perfilControlador.encontrar(Integer.parseInt(value));
        } catch (Exception ex) {
            Logger.getLogger(PerfilConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return ((Perfil) value).getPerIdPk().toString();
    }
    
}
