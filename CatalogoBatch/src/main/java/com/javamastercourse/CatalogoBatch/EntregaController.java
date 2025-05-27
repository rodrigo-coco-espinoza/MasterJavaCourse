package com.javamastercourse.CatalogoBatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javamastercourse.CatalogoBatch.model.Entrega;
import com.javamastercourse.CatalogoBatch.service.EntregaService;

@Controller
public class EntregaController {

    @Autowired
    private EntregaService entregaService;

    @GetMapping({"/", "/home"})
    public String showHome()
    {
        return "home";
    }

    @GetMapping("/todos")
    public ModelAndView showAll(ModelAndView mv)
    {
        // Get all Entregas from the service
        mv.addObject("entregas", entregaService.getAllEntregas());
        
        // Set the view name to catalogo
        mv.setViewName("catalogo");
        
        return mv;
    }

    @GetMapping("/agregar")
    public ModelAndView showForm(ModelAndView mv)
    {
        // Create a new Entrega object and add it to the model
        Entrega entrega = new Entrega();
        mv.addObject("entrega", entrega);
        
        // Add view to the model
        mv.setViewName("agregar_form");

        return mv;
        
    }
    
    @PostMapping("/agregar")
    public ModelAndView addEntrega(Entrega entrega, ModelAndView mv)
    {
        entregaService.addEntrega(entrega);
        mv.setViewName("detalle_entrega");
        
        return mv;
    }
}
