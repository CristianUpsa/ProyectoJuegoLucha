/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registros;

import java.time.LocalDate;

public class RegistroRegister extends Registro {
    private tipoRegistro register;
    private int idUsuario;
    private String nombreUsuario;
    private LocalDate fechaRegistro;

    public RegistroRegister(int idUsuario, String nombreUsuario, LocalDate fechaRegistro) {
        super(idUsuario, nombreUsuario, fechaRegistro);
        this.register = tipoRegistro.REGISTRO;
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return "RegistroRegister{" + "register=" + register + ", idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", fechaRegistro=" + fechaRegistro + '}';
    }
    
}
