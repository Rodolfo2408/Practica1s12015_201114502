/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

/**
 *
 * @author Rodolfo
 */
public class Lista_Jugador {
    NodoJugador primero, ultimo;
    
    public Lista_Jugador(NodoJugador nuevo){
        primero = nuevo;
        ultimo = nuevo;
    }
    
    public void add(NodoJugador nuevo){
        NodoJugador pivote = primero;
        while(pivote != null){
            if(pivote.sig == null){
                pivote.sig = nuevo;
                nuevo.ant = ultimo;
                ultimo = nuevo;
                break;
            }
            pivote = pivote.getSiguiente();
        }
    }
}
