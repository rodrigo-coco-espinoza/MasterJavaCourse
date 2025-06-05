package com.javamastercourse.spring_boot_rest.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javamastercourse.spring_boot_rest.model.Cuento;



@Repository
public interface CuentoRepository extends JpaRepository<Cuento, Integer> {

    List<Cuento> findByTituloContainingOrDescripcionContaining(String titulo, String descripcion);
}