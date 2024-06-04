package com.tesji.api.apitrakstesji.model;
//definir los campos de la tabla

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //la clase la convierte a una tabla
public class DatosApiTraks {

    //Definir los atributos
    //Debe estar encapsulado
    //convertir una llave primaria
    @Id //define como  Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auntoincrementable
    private long id;
    private String track;
    private String artista;
    private String genero;

    //definimos los valores de los demas atributos
    //Se define el construccion  amenos que deja de exitir se no se define


    public DatosApiTraks(String track, String artista, String genero) {
        this.track = track;
        this.artista = artista;
        this.genero = genero;
    }
}
