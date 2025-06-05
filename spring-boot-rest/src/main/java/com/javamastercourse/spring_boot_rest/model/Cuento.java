package com.javamastercourse.spring_boot_rest.model;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
public class Cuento {

    @Id
    private int id;
    private String titulo;
    private String descripcion;
    private String textoFile;
    private Integer tiempoLectura;
    private String dificultad;
    private List<String> imagenes;
    private String fechaCreacion;
 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getTextoFile() {
        return textoFile;
    }

    public void setTextoFile(String textoFile) {
        this.textoFile = textoFile;
    }

    public Integer getTiempoLectura() {
        return tiempoLectura;
    }

    public void setTiempoLectura(Integer tiempoLectura) {
        this.tiempoLectura = tiempoLectura;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public List<String> getImagenes() {
        return imagenes;
    }

    public void setImagenes(List<String> imagenes) {
        this.imagenes = imagenes;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
