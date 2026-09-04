package com.example.MiPriverServidorDeAplicacion;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HomeController {
    @GetMapping("/hello")
    public String hello(){
        return "holaaaa chicos";
    }

    @GetMapping("/saludo")
    public String saludar(@RequestParam String nombre){
        return "holaaaa: " + nombre;
    }

    @PostMapping("/mensaje")
    public String recibirMensaje(@RequestBody String mensaje){

        return "recibi un mensaje :" + mensaje;
    }
}
