/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectojuegolucha;

import java.util.HashMap;
import java.util.HashSet;

import Usuarios.Usuario;
import Registros.Registro;

public class Gestor {
    
    public int buscarUsuario(String nombreUser, HashMap<Integer, Usuario> usuarios){
        for(Usuario usuario : usuarios.values()) {
            if (usuario.getNombre().equals(nombreUser)){
                return usuario.getId();
            }
        }

        return 0;
    }

    public void addRegistro(Registro registro, Integer id, HashSet<Registro> registros){
        registros.add(registro);
    }

}