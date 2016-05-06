/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;


import java.util.Date;

/**
 *
 * @author jose
 */
public class Comentario {
    
    String texto;
    private Date fechaComentario;

    public Comentario(String texto, int anio, int mes, int dia) {
        this.texto = texto;
        this.fechaComentario = new Date(anio, mes, dia);
    }
    
    public Comentario(){
        this.texto = null;
        this.fechaComentario = null;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getFechaComentario() {
        return fechaComentario;
    }

    public void setFechaComentario(Date fechaComentario) {
        this.fechaComentario = fechaComentario;
    }
    
    
}
