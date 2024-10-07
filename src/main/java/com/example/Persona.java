package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public abstract class Persona {

    private String nombre;
    private Genero genero;

    void platosDeComida() {
        System.out.println("Se come 1 plato");
    }

    static void dormir() {
        System.out.println("8 horas de sueño");
    }

}
