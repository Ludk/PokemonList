package com.example.ludkit.pokemon;

/**
 * Created by Ed on 23/02/2016.
 */
public class Pokemon {

    String Nombre;
    String Tipo;

    public Pokemon(String nombre, String tipo) {
        Nombre = nombre;
        Tipo = tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getTipo() {
        return Tipo;
    }
}
