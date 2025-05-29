package com.javamastercourse.spring_boot_rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.javamastercourse.spring_boot_rest.model.Cuento;
import com.javamastercourse.spring_boot_rest.service.CuentoService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@CrossOrigin(origins = "*") // Allow all origins for CORS
public class CuentoController {
    
    @Autowired
    private CuentoService service;

    @GetMapping(path="/cuentos", produces={"application/json"})
    public List<Cuento> getAllCuentos()
    {
        return service.getAllCuentos();
    }

    @GetMapping("/cuento/{id}")
    public Cuento getCuentoById(@PathVariable() int id) {
        return service.getCuentoById(id);
    }

    @PostMapping(path="/cuento", consumes={"application/json"})
    public Cuento addCuento(@RequestBody Cuento cuento)
    {
        service.addCuento(cuento);
        return service.getCuentoById(cuento.getId());
    }

    @PutMapping("/cuento")
    public Cuento updateCuento(@RequestBody Cuento cuento)
    {
        service.updateCuento(cuento);
        return service.getCuentoById(cuento.getId());
    }

    @DeleteMapping("/cuento/{id}")
    public String deleteCuento(@PathVariable() int id)
    {
        service.deleteCuento(id);
        return "Cuento with ID " + id + " deleted successfully.";
    }
}