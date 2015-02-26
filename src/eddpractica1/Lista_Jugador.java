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
    
    public void recorrer(){
        NodoJugador aux = primero;
        while(aux != null){
            System.out.println(aux.Nombre);
            NodoCampo aux2 = aux.campos.primero;
            while(aux2 != null){
                System.out.print(aux2.Campo);
                aux2 = aux2.sig;
            }
            aux = aux.sig;
        }
    }
    
    public void Recgraph(){
        
    }
}
