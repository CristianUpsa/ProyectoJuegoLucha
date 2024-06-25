/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectojuegolucha;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

import Registros.BuilderRegistros;
import Registros.Registro;
import Registros.RegistroRegister;
import Usuarios.BuilderUsuarios;
import Usuarios.Usuario;

public class ProyectoJuegoLucha {
    
    
    public static void main(String[] args) {
        Gestor gestor = new Gestor();
        int usuarioID = 0;
        Scanner sc = new Scanner(System.in);
        String option;
        String nombreUsuario;
        String passwordUsuario;
        int retrn;
        HashMap<Integer, Usuario> usuarios = BuilderUsuarios.buildUsuarios();
        HashSet<Registro> registros = BuilderRegistros.buildRegitros();
        
        do {
            System.out.println("Registrar un nuevo usuario(R) o logear un usuario ya existente(L):");
            option = sc.next();
            retrn = 0;
            switch (option) {
                case "R":
                    while (retrn == 0) {
                        System.out.println("REGISTRO");
                        System.out.println("Nombre del usuario: ");
                        nombreUsuario = sc.next();
                        if(gestor.buscarUsuario(nombreUsuario, usuarios) != 0) {
                            System.out.println("Nombre de usuario ya utilizado");
                            retrn = 1;
                            break;
                        }
                        System.out.println("Password: ");
                        passwordUsuario = sc.next();
                        Usuario newUsuario = new Usuario(usuarios.size(), nombreUsuario, passwordUsuario, 0);
                        usuarios.put(newUsuario.getId(), newUsuario);
                        registros.add(new RegistroRegister(newUsuario.getId(), nombreUsuario, LocalDate.now()));
                        usuarioID = gestor.buscarUsuario(nombreUsuario, usuarios);
                        retrn = -1;
                    }
                    break;
                case "L":
                    while(retrn == 0) {
                        System.out.println("LOGEO");
                        System.out.println("Nombre del usuario: ");
                        nombreUsuario = sc.next();
                        if( gestor.buscarUsuario(nombreUsuario, usuarios) == 0) {
                            System.out.println("Nombre del usuario no encontrado");
                            retrn = 1;
                            break;
                        }
                        System.out.println("Password: ");
                        passwordUsuario = sc.next();
                        usuarioID = gestor.buscarUsuario(nombreUsuario, usuarios);
                        if (usuarios.get(usuarioID).getPassword().equals(passwordUsuario)) {
                            System.out.println("Password correcto");
                            retrn = -1;
                        } else {
                            System.out.println("Password incorrecto");
                            retrn = 0;
                        }
                    }
                    break;
                default:
                    System.out.println("Introduzca correctamente una de las opciones (R/L)");
                    retrn = 0;
                    break;
            }
        }while(retrn != -1);
        
        Menu menu = new Menu();
        menu.mostrar(usuarioID, usuarios, registros);
    }
}

