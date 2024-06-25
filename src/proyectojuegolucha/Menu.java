/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectojuegolucha;

import Combate.Juego;
import Registros.BuilderRegistros;
import Registros.Registro;
import Usuarios.BuilderUsuarios;
import Usuarios.Usuario;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;



public class Menu {
    
    Juego juego = new Juego();
    BuilderUsuarios bu = new BuilderUsuarios();
    BuilderRegistros br = new BuilderRegistros();
    Gestor gr = new Gestor();
    
    public void mostrar(int usuarioID, HashMap<Integer, Usuario> usuarios, HashSet<Registro> registros) {
        Scanner sc = new Scanner(System.in);
        int option;
        int resultado;
        String nombreUsuario;
        
        do {
            do {
                System.out.println("1 Jugar un combate");
                System.out.println("2 Mostrar marcador de usuarios");
                System.out.println("3 Mostrar registros de todos los usuarios");
                System.out.println("4 Mostrar registros de un usuario");
                System.out.println("0 Terminar programa");
                System.out.println();
                option = sc.nextInt();
            } while (option < 0 || option > 4);
            
            switch(option) {
                case 1:
                    resultado = juego.jugar();
                    if(resultado == 1) {
                        usuarios.get(usuarioID).setPuntuacion(usuarios.get(usuarioID).getPuntuacion() + 1);
                    } else if(usuarios.get(usuarioID).getPuntuacion() >= 1) {
                        usuarios.get(usuarioID).setPuntuacion(usuarios.get(usuarioID).getPuntuacion() - 1);
                    }
                    break;
                case 2:
                    bu.mostrarMarcador(usuarios);
                    break;
                case 3: 
                    br.mostrarRegistros(registros);
                    break;
                case 4:
                    do {
                        System.out.println("Nombre del usuario: ");
                        nombreUsuario = sc.next();
                    }while(gr.buscarUsuario(nombreUsuario, usuarios) == 0);
                    br.mostrarRegistrosDeUser(registros, gr.buscarUsuario(nombreUsuario, usuarios));
                    break;
                default:
                    System.out.println("Terminando programa");
                    break;
            }
        }while(option != 0);
    }
}
