/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registros;

import java.time.LocalDate;
import java.util.HashSet;


public class BuilderRegistros {
    
    public static HashSet<Registro> buildRegitros(){
        HashSet<Registro> registros = new HashSet();

        registros.add(new RegistroRegister(1, "Usuario1", LocalDate.of(2024, 5, 20)));
        registros.add(new RegistroRegister(2, "Usuario2", LocalDate.of(2024, 5, 26)));
        registros.add(new RegistroRegister(3, "Usuario3", LocalDate.of(2024, 5, 31)));
        registros.add(new RegistroRegister(4, "Usuario4", LocalDate.of(2024, 6, 2)));
        registros.add(new RegistroRegister(5, "Usuario5", LocalDate.of(2024, 6, 3)));
        registros.add(new RegistroRegister(6, "Usuario6", LocalDate.of(2024, 6, 5)));

        registros.add(new RegistroLogin(1, "Usuario1", LocalDate.of(2024, 5, 21)));
        registros.add(new RegistroLogin(2, "Usuario2", LocalDate.of(2024, 5, 27)));
        registros.add(new RegistroLogin(3, "Usuario3", LocalDate.of(2024, 6, 1)));
        registros.add(new RegistroLogin(4, "Usuario4", LocalDate.of(2024, 6, 4)));
        registros.add(new RegistroLogin(5, "Usuario5", LocalDate.of(2024, 6, 4)));
        registros.add(new RegistroLogin(6, "Usuario6", LocalDate.of(2024, 6, 6)));

        return registros;
    }
    
    public void mostrarRegistros(HashSet<Registro> registros) {
        for (Registro registro : registros) {
            System.out.println(registro);
        }
    }
    
    public void mostrarRegistrosDeUser(HashSet<Registro> registros, int idUsuario) {
        for (Registro registro : registros) {
            if (registro.getIdUsuario() == idUsuario) {
                System.out.println(registro);
            }
        }
    }
}
