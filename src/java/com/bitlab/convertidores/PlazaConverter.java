/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.convertidores;

import com.bitlab.controladores.PlazaControlador;
import com.bitlab.entidades.Plaza;
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
@FacesConverter("plazaConverter")
public class PlazaConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        try {
            PlazaControlador plazaControlador = new PlazaControlador();
            return plazaControlador.encontrar(Integer.parseInt(string));
        } catch (Exception ex) {
            Logger.getLogger(PlazaConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        return ((Plaza) o).getPlaIdPk().toString();
    }
    
}
