/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class BuilderUsuarios {
    
    public static HashMap<Integer, Usuario> buildUsuarios(){
        HashMap<Integer, Usuario> usuarios = new HashMap<>();

        usuarios.put(1, new Usuario(1, "Usuario1", "Usuario1Password", 90));
        usuarios.put(2, new Usuario(2, "Usuario2", "Usuario2Password", 20));
        usuarios.put(3, new Usuario(3, "Usuario3", "Usuario3Password", 70));
        usuarios.put(4, new Usuario(4, "Usuario4", "Usuario4Password", 40));
        usuarios.put(5, new Usuario(5, "Usuario5", "Usuario5Password", 60));
        usuarios.put(6, new Usuario(6, "Usuario6", "Usuario6Password", 20));

        return usuarios;
    }
    
    public void mostrarMarcador(HashMap<Integer, Usuario> usuarios) {
        List<Usuario> listaUsuarios = new ArrayList<>(usuarios.values());

        Collections.sort(listaUsuarios, new Comparator<Usuario>() {
            @Override
            public int compare(Usuario u1, Usuario u2) {
                return Integer.compare(u2.getPuntuacion(), u1.getPuntuacion());
            }
        });
        
        for (Usuario usuario : listaUsuarios) {
            System.out.println(usuario);
        }
    }

}
