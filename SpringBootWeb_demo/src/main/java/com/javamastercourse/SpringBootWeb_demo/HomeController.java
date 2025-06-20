package com.javamastercourse.SpringBootWeb_demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController 
{

    @GetMapping("/hola")
    public String hola(@RequestParam(name = "name", required = false, defaultValue = "Pepe") String name, Model model) 
    {
        // This method handles requests to /hola and returns a view named "hola"
        // The name parameter is optional, with a default value of "Pepe"
        System.out.println("HomeController.hola() called with name: " + name);
        
        // Add the name to the model to be used in the view
        model.addAttribute("name", name);
        
        // Return the view name, which will resolve to /WEB-INF/jsp/hola.jsp if configured properly
        return "hola"; 
    }

    @GetMapping("/adiosin")
    public String adios()
    {
        System.out.println("AdioController.adios() called");
        return "adios"; // This will resolve to /WEB-INF/jsp/index.jsp if configured properly 
    }

    @GetMapping("/calculator")
    public String showForm(Model model)
    {
        System.out.println("HomeController.showForm() called");
        Numeros numeros = new Numeros();
        model.addAttribute("numeros", numeros);
        
        return "calculator"; 
    }

    @PostMapping("/calculator")
    public ModelAndView doCalculate(Numeros numeros, ModelAndView modelAndView) 
    {
        System.out.println("HomeController.doCalculate() called with: " + numeros);
        
        // Perform the calculation (for example, addition)
        int result = numeros.getNumber1() + numeros.getNumber2();
        
        // Add the result to the modelAndView
        modelAndView.addObject("result", result);
        //modelAndView.addObject("numeros", numeros); // Add the original numbers to the model
        
        // Set the view name to display the result
        modelAndView.setViewName("result"); 
        
        return modelAndView; 
    }
    // {
    //     System.out.println("HomeController.doCalculate() called with: " + numeros);
        
    //     // Perform the calculation (for example, addition)
    //     int result = numeros.getNumber1() + numeros.getNumber2();
        
    //     // Add the result to the model
    //     model.addAttribute("result", result);
    //     model.addAttribute("numeros", numeros); // Add the original numbers to the model
        
    //     // Return the view name to display the result
    //     return "result"; 
    // }

    @GetMapping("/")
    public String index() 
    {
        // This method handles requests to the root URL ("/") and returns the index view
        System.out.println("HomeController.index() called");
        return ""; // This will resolve to /WEB-INF/jsp/index.jsp if configured properly 
    }


}
