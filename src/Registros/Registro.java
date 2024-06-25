/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registros;

import java.time.LocalDate;

public abstract class Registro {
    private int idUsuario;
    private String nombreUsuario;
    private LocalDate fechaRegistro;

    public enum tipoRegistro{
        REGISTRO,
        LOGEO
    }

    public Registro(int idUsuario, String nombreUsuario, LocalDate fechaRegistro) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.fechaRegistro = fechaRegistro;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return "Registro [idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", fechaRegistro="
                + fechaRegistro + "]";
    }

}

