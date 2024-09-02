package com.desafioalura.screenmatch_frases.repository;

import com.desafioalura.screenmatch_frases.dto.FraseDTO;
import com.desafioalura.screenmatch_frases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//Creacion de una Interface para realizar consultas personalizadas con nuestra BD
public interface FraseRepository extends JpaRepository<Frase, Integer> {

    //Consulta personalizada para obtener la informacion de nuestra serie de forma aleatoria.
    @Query("SELECT f FROM Frase f ORDER BY function('RANDOM') LIMIT 1")
    Frase obtenerFraseAletoria();
}
