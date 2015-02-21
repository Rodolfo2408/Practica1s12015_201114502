/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

/**
 *
 * @author Rodolfo
 */
public class NodoMat2 {
    String URLImage;
    public Lista_Personajes CaracterList;
    int fil;
    int col;
    NodoMat2 sigfil, sigcol;
    
    NodoMat2(int f,int c, String imagen, Personaje Nodopersonajes){
        this.URLImage = imagen;
        this.CaracterList = new Lista_Personajes(Nodopersonajes);
        this.fil=f;
        this.col=c;
        this.sigfil = this.sigcol=null;
    }
}
