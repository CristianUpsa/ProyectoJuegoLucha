/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Combate.Personajes;

import Combate.Movimientos;

public abstract class Personaje implements Movimientos {
    
    private String nombre;
    private int salud;
    private int ataque;
    private int defensa;

    public Personaje(String nombre, int salud, int ataque, int defensa) {
        this.nombre = nombre;
        this.salud = salud;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    
    @Override
    public void recibirDanno(int danno) {
        int dannoReal = danno - defensa;
        if (dannoReal > 0){
            salud -= dannoReal;
        }
        if (salud < 0){
            salud = 0;
        }
    }
    
    
    @Override
    public void atacar(Personaje enemigo) {
        enemigo.recibirDanno(ataque);
        System.out.println(nombre + " ataca a " + enemigo.getNombre() + " y causa " + ataque + " puntos de daño.");
    }
    
    @Override
    public boolean estaVivo() {
        return salud > 0;
    }
    
}
