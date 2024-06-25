/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Combate;

import Combate.Personajes.Arquero;
import Combate.Personajes.Guerrero;
import Combate.Personajes.Hechicero;
import Combate.Personajes.Mago;
import Combate.Personajes.Personaje;
import java.util.Random;
import java.util.Scanner;


public class Juego {
    public int jugar() {
      
        Personaje guerrero = new Guerrero();
        Personaje mago = new Mago();
        Personaje arquero = new Arquero();
        Personaje hechicero = new Hechicero();
        
        Personaje[] personajes = {guerrero, mago, arquero, hechicero};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige tu personaje:");
        System.out.println("1. Guerrero");
        System.out.println("2. Mago");
        System.out.println("3. Arquero");
        System.out.println("4. Hechicero");
        int eleccion = scanner.nextInt();

        Personaje personajeUsuario = null;
        switch (eleccion) {
            case 1:
                personajeUsuario = guerrero;
                break;
            case 2:
                personajeUsuario = mago;
                break;
            case 3:
                personajeUsuario = arquero;
                break;
            case 4:
                personajeUsuario = hechicero;
                break;
            default:
                System.out.println("Elección no válida, seleccionando Guerrero por defecto.");
                personajeUsuario = guerrero;
                break;
        }

        Random random = new Random();
        Personaje personajeOponente;
        do {
            personajeOponente = personajes[random.nextInt(personajes.length)];
        } while (personajeOponente == personajeUsuario);
        
        Combate combate = new Combate(personajeUsuario, personajeOponente);
        combate.iniciarCombate();
        
        if(personajeUsuario.getSalud() > 0) {
            System.out.println("VICTORIA!");
            return 1;
        }
        
        System.out.println("DERROTA!");
        
        return 0;
    }
}
