/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

/**
 *
 * @author Rodolfo
 */
public class Planta {
    
    String nombre, tipo, imagenURL;
    int ataque, defensa;
    int posX, posY;
    
    Planta siguiente, anterior;

    public Planta(){}
    
    public Planta(String nombre, String tipo, String imagen, int defensa, int ataque) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataque = ataque;
        this.defensa = defensa;
    }
    
    public String getDato(){
        return nombre;
    }
    
    public void setDato(){
        this.nombre = nombre;
    }
    
    public Planta getAnterior(){
        return anterior;
    }
    
    public void setAnterior(Planta anterior){
        this.anterior = anterior;
    }
    
    public Planta getSiguiente(){
        return siguiente;
    }
    
    public void setSiguiente(Planta siguiente){
        this.siguiente = siguiente;
    }
}
