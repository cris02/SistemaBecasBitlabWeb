/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.convertidores;

import com.bitlab.controladores.CursoControlador;
import com.bitlab.entidades.Curso;
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

@FacesConverter("cursoConverter")
public class CursoConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        try {
            CursoControlador cursoControlador = new CursoControlador();
            return cursoControlador.encontrar(Integer.parseInt(string));
        } catch (Exception ex) {
            Logger.getLogger(CursoConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        return ((Curso) o).getCurIdPk().toString();
    }
    
}
