/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

/**
 *
 * @author Rodolfo
 */
public class Personaje {
    int posx, posy, ptsAtaque, ptsDefensa;
    String nombre, tipo, imagenuRL;
    boolean TAtaque;
    Personaje siguiente, anterior;

    public Personaje(int posx, int posy, int ptsAtaque, int ptsDefensa, String nombre, String tipo, String imagenuRL, boolean Tataque) {
        this.posx = posx;
        this.posy = posy;
        this.ptsAtaque = ptsAtaque;
        this.ptsDefensa = ptsDefensa;
        this.nombre = nombre;
        this.tipo = tipo;
        this.imagenuRL = imagenuRL;
        this.TAtaque = Tataque;
    }    
    
    public Personaje getSiguiente(){
        return siguiente;
    }
            
}
