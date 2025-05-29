package com.javamastercourse.spring_boot_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javamastercourse.spring_boot_rest.model.Cuento;
import com.javamastercourse.spring_boot_rest.repository.CuentoRepository;


@Service
public class CuentoService {

    @Autowired
    private CuentoRepository repository;

    public void addCuento(Cuento entrega) 
    {
        repository.save(entrega);
    }

    public List<Cuento> getAllCuentos() 
    {
        System.out.println("Fetching all cuentos from the repository");
        return repository.findAll();
    }

    public Cuento getCuentoById(int id) 
    {
        return repository.findById(id);
    }

    
}
