package com.tesji.api.apitrakstesji.controller;

import com.tesji.api.apitrakstesji.model.DatosApiTraks;
import com.tesji.api.apitrakstesji.service.ApiTraksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

//clase que define el Acceso a la API mediante URL
// y tambien los end-pints(peticiones http)
@RestController //control de peticiones "la clase es una api REST"
@RequestMapping("/api-traks") //Mapear las respuestas
public class ApiTracks {
    //inyectar mi objeto repositoy con los operaciones crud
    @Autowired
    ApiTraksService apiTraksService;

    @GetMapping("get-prueba")
    public String Pruebaget() {
        return "Funciona!! Bienvenido a la API TRANKS TESJI";
    }

    @GetMapping("/get-mostrartodo")
    public ArrayList<DatosApiTraks> mostrarTodosTracks() {
        return apiTraksService.mostrarTracks();
    }
}
