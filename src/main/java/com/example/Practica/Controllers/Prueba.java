package com.example.Practica.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Prueba {
    @GetMapping("listar")
    public String listar (){
        return "Hola soy get";
    }
    @PostMapping("/Agregar")
    public String Agregar(){
        return "Hola soy put";
    }

    @DeleteMapping("/Borrar")
    public String Borrar(){
        return "Hola soy Delete";
    }

    @PutMapping("/Editar")
    public String Editar(){
        return "Hola soy Put";
    }
}
