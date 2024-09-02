package com.desafioalura.screenmatch_frases.service;

import com.desafioalura.screenmatch_frases.dto.FraseDTO;
import com.desafioalura.screenmatch_frases.model.Frase;
import com.desafioalura.screenmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Clase Service para implementar la lógica
@Service
public class FraseService {

    @Autowired
    private  FraseRepository repository;

    //Metodo para obtener los datos se la serie.
    public FraseDTO obtenerFraseAleatoria() {
        Frase frase = repository.obtenerFraseAletoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonaje(), frase.getPoster());

    }
}
