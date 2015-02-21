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

    public Personaje(int ptsAtaque, int ptsDefensa, String nombre, String tipo, String imagenuRL, boolean vivo) {
        this.ptsAtaque = ptsAtaque;
        this.ptsDefensa = ptsDefensa;
        this.nombre = nombre;
        this.tipo = tipo;
        this.imagenuRL = imagenuRL;
        this.TAtaque = vivo;
    }    
    
    public Personaje(){}
    
    public Personaje getSiguiente(){
        return siguiente;
    }
            
}
