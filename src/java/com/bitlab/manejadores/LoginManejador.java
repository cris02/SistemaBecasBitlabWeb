/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.manejadores;

import com.bitlab.controladores.InicioSesionControlador;
import com.bitlab.entidades.Usuario;
import com.bitlab.utilidades.EncriptacionTexto;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author henry
 */
@ManagedBean
@SessionScoped
public class LoginManejador {

    private String usuario;
    private String password;
    private InicioSesionControlador inicioSesionControlador;
    private Usuario usuarioEncontrado;
    private EncriptacionTexto encript;

    public LoginManejador() {
        inicioSesionControlador = new InicioSesionControlador();
        usuarioEncontrado = new Usuario();
        encript = new EncriptacionTexto();
    }

    public void login() {
        try {
            System.out.println("Logueado");
            System.out.println("Usuario: " + usuario);
            System.out.println("Contra: " + password);
            usuarioEncontrado = inicioSesionControlador.encontrarPorUser(usuario);
            if (usuarioEncontrado == null) {
                System.out.println("No se encontro el usuario");
            } else {
                System.out.println("Usuario: " + usuarioEncontrado);
                if (password.equals(encript.getTextoDesencriptado(usuarioEncontrado.getUsuPass()))) {
                    System.out.println("CONTRASENA VALIDA!!!");
                } else {
                    System.out.println("CONTRASENA NO VALIDA");
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(LoginManejador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}