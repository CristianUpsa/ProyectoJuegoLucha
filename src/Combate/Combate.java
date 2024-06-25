/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Combate;

import Combate.Personajes.Personaje;
import java.util.Random;

public class Combate {
    private Personaje p1;
    private Personaje p2;
    private Random random;

    public Combate(Personaje p1, Personaje p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.random = new Random();
    }

    public void iniciarCombate() {
        System.out.println("¡El combate entre " + p1.getNombre() + " y " + p2.getNombre() + " comienza!");

        while (p1.estaVivo() && p2.estaVivo()) {
            if (random.nextBoolean()) {
                p1.atacar(p2);
            } else {
                p2.atacar(p1);
            }

            System.out.println(p1.getNombre() + " tiene " + p1.getSalud() + " puntos de salud restantes.");
            System.out.println(p2.getNombre() + " tiene " + p2.getSalud() + " puntos de salud restantes.");
        }

        if (p1.estaVivo()) {
            System.out.println(p1.getNombre() + " ha ganado el combate.");
        } else {
            System.out.println(p2.getNombre() + " ha ganado el combate.");
        }
    }
}
