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
     int fil;
    int col;
    int info;
    NodoMat2 sigfil;
    NodoMat2 sigcol;
    public NodoMat2(int i,int f,int c)	{
        this.info=i;
        this.fil=f;
        this.col=c;
        this.sigfil=null;
        this.sigcol=null;
    }
}
