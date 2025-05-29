package com.javamastercourse.spring_boot_rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.javamastercourse.spring_boot_rest.model.Cuento;
import com.javamastercourse.spring_boot_rest.service.CuentoService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@CrossOrigin(origins = "*") // Allow all origins for CORS
public class CuentoController {
    
    @Autowired
    private CuentoService service;

    @GetMapping("/cuentos")
    public List<Cuento> getAllCuentos()
    {
        return service.getAllCuentos();
    }

    @GetMapping("/cuento/{id}")
    public Cuento getCuentoById(@PathVariable() int id) {
        return service.getCuentoById(id);
    }

    @PostMapping("/cuento")
    public Cuento addCuento(@RequestBody Cuento cuento)
    {
        service.addCuento(cuento);
        return service.getCuentoById(cuento.getId());
    }
}