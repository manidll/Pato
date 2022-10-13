/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.pato.entidades;

import java.util.Date;
import java.util.List;

/**
 *
 * @author alumnog
 */
public class Video {
    
    private String titulo;
    private String descripcion;
    private Date fecha;
    private Usuario usuario;
    private List <Comentario> comentario;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List <Comentario> getComentario() {
        return comentario;
    }

    public void setComentario(List <Comentario> comentario) {
        this.comentario = comentario;
    }
    
    
    
    
}
