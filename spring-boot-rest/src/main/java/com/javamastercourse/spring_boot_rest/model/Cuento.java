package com.javamastercourse.spring_boot_rest.model;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Cuento {

    private int id;
    private String titulo;
    private String descripcion;
    private String texto_file;
    private Integer tiempoLectura;
    private String dificultad;
    private List<String> imagenes;
    private String fechaCreacion;
 

}
