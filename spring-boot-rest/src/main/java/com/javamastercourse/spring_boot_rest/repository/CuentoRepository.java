package com.javamastercourse.spring_boot_rest.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.javamastercourse.spring_boot_rest.model.Cuento;



@Repository
public class CuentoRepository {

    List<Cuento> entregas = new ArrayList<>(Arrays.asList(
        new Cuento(1, "El Principito", "Un cuento sobre la amistad y la soledad", "el_principito.txt", 30, "Fácil", Arrays.asList("imagen1.jpg", "imagen2.jpg"), "2023-01-01"),
        new Cuento(2, "Caperucita Roja", "Un clásico cuento de advertencia", "caperucita_roja.txt", 15, "Fácil", Arrays.asList("caperucita1.jpg", "caperucita2.jpg"), "2023-02-01"),
        new Cuento(3, "La Bella Durmiente", "Un cuento de amor y magia", "bella_durmiente.txt", 20, "Media", Arrays.asList("bella1.jpg", "bella2.jpg"), "2023-03-01"),
        new Cuento(4, "Hansel y Gretel", "Un cuento sobre la supervivencia y la astucia", "hansel_gretel.txt", 25, "Media", Arrays.asList("hansel1.jpg", "gretel1.jpg"), "2023-04-01"),
        new Cuento(5, "El Patito Feo", "Un cuento sobre la transformación y la aceptación", "patito_feo.txt", 10, "Fácil", Arrays.asList("patito1.jpg", "patito2.jpg"), "2023-05-01")

    ));

    public List<Cuento> findAll() {
        System.out.println("estoy buscnado");
        return entregas;
    }

    public Cuento findById(int id) {
        return entregas.stream()
                .filter(entrega -> entrega.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void save(Cuento entrega) {
        entregas.add(entrega);
    }   
}
