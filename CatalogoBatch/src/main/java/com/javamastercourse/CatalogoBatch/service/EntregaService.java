package com.javamastercourse.CatalogoBatch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javamastercourse.CatalogoBatch.model.Entrega;
import com.javamastercourse.CatalogoBatch.repository.EntregaRepository;

@Service
public class EntregaService {

    @Autowired
    private EntregaRepository entregaRepository;

    public void addEntrega(Entrega entrega) {
        entregaRepository.save(entrega);
    }

    public List<Entrega> getAllEntregas() {
        System.out.println("Fetching all entregas from the repository");
        return entregaRepository.findAll();
    }
    
}
