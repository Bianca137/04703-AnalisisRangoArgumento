/*
 * Copyright 2019 Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

import java.util.Random;

/**
 *
 * @author Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es
 */
public final class App {

    // Constantes de clase
    public static final int NUM_MIN;
    public static final int NUM_MAX;
    public static final int NUM;

    static {
        //Random
        final Random RND = new Random();

        //Constantes
        final int MAX = 10;
        final int MIN = 1;

        //Valores > constantes
        NUM_MAX = RND.nextInt(MAX - MIN + 1) + MIN;
        // El máximo será el número que se genera arriba, para que no pueda ser mayor que él, ya que es min
        NUM_MIN = RND.nextInt(NUM_MAX - MIN + 1) + MIN;
        NUM = 10;

    }

    public final void launchApp() {

        // Llamamos al método
        int valor = analizarRango(NUM, NUM_MIN, NUM_MAX);

        System.out.println("ANÁLISIS DE RANGO");
        System.out.println("=================");
        System.out.printf("Número ......: %d%n", NUM);
        System.out.println("---");
        System.out.printf("Mínimo ......: %d%n", NUM_MIN);
        System.out.printf("Máximo ......: %d%n", NUM_MAX);
        System.out.println("---");

        // Evaluamos el valor que nos ha devuelto el método analizarRango
        // y mostramos un print u otro dependiendo de los que nos haya devuelto
        switch (valor) {
            case 0:
                System.out.println("Análisis ....: DENTRO");
                break;
            case 1:
                System.out.println("Análisis ....: FUERA ( Abajo )");
                break;
            case 2:
                System.out.println("Análisis ....: FUERA ( Arriba )");
                break;
            default:
                break;
        }

    }

    public static final int analizarRango(double num, double min, double max) {
        int valor;

        if (num > max) {
            valor = 2;
        } else if (num < min) {
            valor = 1;
        } else {
            valor = 0;
        }
        return valor;
    }

}
