/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.convertidores;

import com.bitlab.controladores.EvaluadorControlador;
import com.bitlab.entidades.Evaluador;
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

@FacesConverter("evaluadorConverter")
public class EvaluadorConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        try {
            EvaluadorControlador evaluadorControlador = new EvaluadorControlador();
            return evaluadorControlador.encontrar(Integer.parseInt(string));
        } catch (Exception ex) {
            Logger.getLogger(EvaluadorConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        return ((Evaluador) o).getEvaIdPk().toString();
    }
    
}
