/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

/**
 *
 * @author Rodolfo
 */
public class NodoMat {
    String URLImage;
    public Lista_Personajes CaracterList;
    NodoMat arriba, abajo, izquierda, derecha;
    
    public NodoMat(String URLImangen, Personaje lista){
        this.URLImage = URLImangen;
        CaracterList = new Lista_Personajes(lista);
        arriba = abajo = izquierda = derecha = null;
    }
}
