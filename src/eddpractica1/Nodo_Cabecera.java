/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

/**
 *
 * @author Rodolfo
 */
public class Nodo_Cabecera {
    int id;
    Nodo_Cabecera ant, sig;
    NodoMat interior;
    
    public Nodo_Cabecera(int id){
        this.id=id;
        this.ant=null;
        this.sig=null;
        this.interior=null;
    }
}
