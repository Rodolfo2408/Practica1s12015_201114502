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
    String tipo;
    int posx;
    int posy;
    String personaje;
    int danio;
    int ataque;
    public static NodoMat izquierda, derecha, arriba, abajo, atras, adelante;
    
    public NodoMat(String tipo, int posx, int posy, String personaje, int danio, int ataque){
        this.tipo=tipo;
        this.posx=posx;
        this.posy=posy;
        this.personaje=personaje;
        this.danio=danio;
        this.ataque=ataque;
        this.izquierda=null;
        this.derecha=null;
        this.arriba=null;
        this.abajo=null;
        this.atras=null;
        this.adelante=null;
        //this.cabeza=null;
    }   
}
