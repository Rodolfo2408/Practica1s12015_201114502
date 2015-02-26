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
        primero = nuevo;
        ultimo = nuevo;
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
    
    String graphListaC;
    public String recorrer(String incio){
        graphListaC = "";
        NodoCampo pivote = primero;
        if(pivote == null){
            graphListaC = "NULL";
        }else if(pivote.sig == null){
            graphListaC += incio + "->" + pivote.Campo + " ";
        }else{
            graphListaC += incio + "->"+ pivote.Campo + " ";
            while(pivote.sig != null){
                graphListaC += pivote.Campo + "->" + pivote.sig.Campo + " ";
                pivote = pivote.sig;
            }
        }
        return graphListaC;
    }
}
