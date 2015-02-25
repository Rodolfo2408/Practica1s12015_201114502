/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

/**
 *
 * @author Rodolfo
 */
public class NodoCampo {
    public NodoCampo sig, ant;
    
    String Campo;
    
    public NodoCampo(){}
    
    public NodoCampo(String campo) {
        this.Campo = campo;
    }
    
    public String getDato(){
        return Campo;
    }
    
    public void setDato(){
        this.Campo = Campo;
    }
    
    public NodoCampo getAnterior(){
        return ant;
    }
    
    public void setAnterior(NodoCampo anterior){
        this.ant = anterior;
    }
    
    public NodoCampo getSiguiente(){
        return sig;
    }
    
    public void setSiguiente(NodoCampo siguiente){
        this.sig = siguiente;
    }
}
