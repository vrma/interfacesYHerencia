package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Estudiante extends Persona {

    private int totalAsignaturas;

    void platosDeComida() {
        System.out.println("Se come 3 plato");
    }

    static void dormir() {
        System.out.println("5 horas de sueño");
    }

}
