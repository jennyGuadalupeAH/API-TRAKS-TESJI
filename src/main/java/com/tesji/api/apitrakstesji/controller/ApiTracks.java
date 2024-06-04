package com.tesji.api.apitrakstesji.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//clase que define el Acceso a la API mediante URL
// y tambien los end-pints(peticiones http)
@RestController //control de peticiones "la clase es una api REST"
@RequestMapping("/api-traks") //Mapear las respuestas
public class ApiTracks {
    @GetMapping("get-prueba")
    public String Pruebaget(){
        return "Funciona!! Bienvenido a la API TRANKS TESJI";



    }
}

