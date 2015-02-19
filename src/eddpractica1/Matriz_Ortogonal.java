/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

/**
 *
 * @author Rodolfo
 */
public class Matriz_Ortogonal {
    NodoMat actual;
    
    public Matriz_Ortogonal(){
        actual = new NodoMat("Nothing", null);
    }
    
    public void ConecSimpFila(NodoMat nodo1, NodoMat nodo2){
        nodo1.derecha = nodo2;
        nodo2.izquierda = nodo1;
    }
    
    public void ConecDobFila(NodoMat Nuevo, NodoMat NodoAnt, NodoMat NodoSig){
        NodoSig.izquierda = Nuevo;
        Nuevo.derecha = NodoSig;
        Nuevo.izquierda = NodoAnt;
        NodoAnt.derecha = Nuevo;
    }
    
    public void ConecSimColumna(NodoMat nodo1, NodoMat nodo2){
        nodo1.abajo = nodo2;
        nodo2.arriba = nodo1;
    }
    
    public void ConecDobCol(NodoMat Nuevo, NodoMat NodoUP, NodoMat NodoDown){
        Nuevo.arriba = NodoUP;
        Nuevo.abajo = NodoDown;
        NodoDown.arriba = Nuevo;
        NodoUP.abajo = Nuevo;
    }
    
    public void DConSimFila(NodoMat nodo1, NodoMat nodo2){
        nodo1.derecha = nodo2.izquierda = null;
    }
    
    public void DConDobFila(NodoMat Nuevo, NodoMat NodoAnt, NodoMat NodoSig){
        NodoSig.izquierda = NodoAnt;
        NodoAnt.derecha = NodoSig;
        Nuevo.izquierda = Nuevo.derecha = null;
    }
    
    public void DConSimColumna(NodoMat nodo1, NodoMat nodo2){
        nodo1.abajo = nodo2.arriba = null;
    }
    
    public void DConDobColumna(NodoMat Nuevo, NodoMat NodoAnt, NodoMat NodoSig){
        NodoSig.arriba = NodoAnt;
        NodoAnt.abajo = NodoSig;
        Nuevo.abajo = Nuevo.arriba = null;
    }
}
