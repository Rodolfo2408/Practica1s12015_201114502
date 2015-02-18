/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

/**
 *
 * @author Rodolfo
 */
public class ListaCampos {
    NodoCampo primero, ultimo;
    
    public ListaCampos(NodoCampo nuevo){
        primero = ultimo = nuevo;
    }
    
    public void add(NodoCampo nuevo){
        NodoCampo pivot = primero;
        while(pivot != null){
            if(pivot.sig == null){
                pivot.sig = nuevo;
                nuevo.ant = ultimo;
                ultimo = nuevo;
                break;
            }
            pivot = pivot.getSiguiente();
        }
    }
}
