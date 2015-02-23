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
    boolean vivo;
    
    Planta siguiente, anterior;

    public Planta(){}
    
    public Planta(String nombre, String tipo, String imagen, int defensa, int ataque, boolean vivo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataque = ataque;
        this.defensa = defensa;
        this.vivo = vivo;
        this.vivo=true;
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
