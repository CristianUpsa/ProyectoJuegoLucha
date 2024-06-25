/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registros;

import java.time.LocalDate;

public class RegistroLogin extends Registro{
    private tipoRegistro login;
    private int idUsuario;
    private String nombreUsuario;
    private LocalDate fechaRegistro;

    public RegistroLogin(int idUsuario, String nombreUsuario, LocalDate fechaRegistro) {
        super(idUsuario, nombreUsuario, fechaRegistro);
        this.login = tipoRegistro.LOGEO;
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return "RegistroLogin{" + "login=" + login + ", idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", fechaRegistro=" + fechaRegistro + '}';
    }
    
}
