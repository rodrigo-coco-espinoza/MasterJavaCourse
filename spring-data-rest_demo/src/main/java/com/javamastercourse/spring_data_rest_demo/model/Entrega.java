package com.javamastercourse.spring_data_rest_demo.model;

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
public class Entrega {

    @Id
    private int id;
    private String nombre;
    private String descripcion;
    private String prepara;
    private String periodicidad;
    private List<String> campos;



}
