/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

/**
 *
 * @author Rodolfo
 */
public class Zombie {
    
    
    String nombre, tipo, imagenURL;
    int ataque, defensa;
    Zombie siguiente;
    Zombie anterior;
   
    public Zombie(){}

    public Zombie(String nombre, String tipo, String imagenURL, int ataque, int defensa) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.imagenURL = imagenURL;
        this.ataque = ataque;
        this.defensa = defensa;
    }
    
    public String getDato(){
        return nombre;
    }
    
    public void setDato(){
        this.nombre = nombre;
    }
    
    public Zombie getAnterior(){
        return anterior;
    }
    
    public void setAnterior(Zombie anterior){
        this.anterior = anterior;
    }
    
    public Zombie getSiguiente(){
        return siguiente;
    }
    
    public void setSiguiente(Zombie siguiente){
        this.siguiente = siguiente;
    }    
}
