package com.desafioalura.screenmatch_frases.controller;

import com.desafioalura.screenmatch_frases.dto.FraseDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RestController;
import com.desafioalura.screenmatch_frases.service.FraseService;

//Clase FraseController
@RestController
public class FraseController {

    @Autowired
    private FraseService servicio;

    //EndPoint para obtener las frases de nuestras series
    @GetMapping("/series/frases")
    public FraseDTO obtenerFraseAleatoria(){
        return servicio.obtenerFraseAleatoria();
    }


}
