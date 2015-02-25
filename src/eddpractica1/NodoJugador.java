/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

/**
 *
 * @author Rodolfo
 */
public class NodoJugador {
    public NodoJugador sig, ant;
    public ListaCampos campos;
    
    int cantidad;
    String Nombre;
    
    public NodoJugador(String campo) {
        this.Nombre = campo;
    }
    
    public NodoJugador(String Nombre, NodoCampo nuevo) {
        this.Nombre = Nombre;
        campos = new ListaCampos(nuevo);
        this.ant = this.sig = null;
    }
    
    public String getDato(){
        return Nombre;
    }
    
    public void setDato(){
        this.Nombre = Nombre;
    }
    
    public NodoJugador getAnterior(){
        return ant;
    }
    
    public void setAnterior(NodoJugador anterior){
        this.ant = anterior;
    }
    
    public NodoJugador getSiguiente(){
        return sig;
    }
    
    public void setSiguiente(NodoJugador siguiente){
        this.sig = siguiente;
    }
}
