/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Combate;

import Combate.Personajes.Personaje;

public interface Movimientos {
    public void recibirDanno(int danno);
    
    public void atacar(Personaje enemigo);
    
    public boolean estaVivo();
}
