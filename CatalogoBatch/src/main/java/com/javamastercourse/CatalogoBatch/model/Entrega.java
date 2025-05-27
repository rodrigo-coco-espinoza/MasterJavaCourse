package com.javamastercourse.CatalogoBatch.model;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Entrega {

    private int id;
    private String nombre;
    private String descripcion;
    private String prepara;
    private String periodicidad;
    private List<String> campos;



}
