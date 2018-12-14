package com.curso.ecosistema.holamundomaven;

import java.util.Locale;

public class Saludo {
    public String saludaAlMundo() {
        return "Hola Mundo!!";
    }

    public String saludaAlguien(String nombre) {
        return saludaAlguien(nombre, new Locale("es"));
    }

    public String saludaAlguien(String nombre, Locale idioma) {
        if(idioma.equals(Locale.ENGLISH))
            return "Hello " + nombre + "!!";
        else
            return "Hola " + nombre + "!!";
    }
}
