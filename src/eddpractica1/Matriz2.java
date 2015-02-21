/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

/**
 *
 * @author Rodolfo
 */
public class Matriz2 {
    NodoMat2 nodomat;
    String imagen;
    
    public void crear(int fil, int col){
        nodomat = new NodoMat2(fil, col, "", null);
        nodomat.sigfil=nodomat;
        nodomat.sigcol=nodomat;
        int i=1;
        NodoMat2 q = nodomat;
        while(i<=fil){
            NodoMat2 nuevo = new NodoMat2(i, 0, "", null);
            q.sigfil = nuevo;
            nuevo.sigcol = nuevo;
            q = nuevo;
            i++;
        }
        q.sigfil = nodomat;
        i=1;
        q=nodomat;
        while(i<=col){
            NodoMat2 nuevo = new NodoMat2(0, i, "", null);
            q.sigcol = nuevo;
            nuevo.sigfil = nuevo;
            q = nuevo;
            i++;
        }
        q.sigcol = nodomat;
    }
    
    NodoMat2 arriba(int f, int c){
        NodoMat2 aux = nodomat.sigcol;
        while(aux.col != c){
            aux = aux.sigcol;
        }
        NodoMat2 aux1 = aux.sigfil;
        NodoMat2 aux2 = aux1.sigfil;
        NodoMat2 aux3 = aux;
        while((aux1.fil<f)&&(aux2.fil != 0)){
            aux = aux1;
            aux1=aux1.sigfil;
            aux2=aux2.sigfil;
        }
        if(aux1.fil<f){
            return aux1;
        }else{
            return aux;
        }
    }
    
    NodoMat2 izquierda(int f, int c){
        NodoMat2 aux = nodomat.sigfil;
        while(aux.fil != f){
            aux = aux.sigfil;
        }
        NodoMat2 aux1 = aux.sigcol;
        NodoMat2 aux2 = aux1.sigcol;
        NodoMat2 aux3 = aux;
        while((aux1.col<c)&&(aux2.col != 0)){
            aux = aux1;
            aux1=aux1.sigcol;
            aux2=aux2.sigcol;
        }
        if(aux1.col < c){
            return aux1;
        }else{
            return aux;
        }
    }
    
    public void add(String urlPasto, int f, int c, Personaje Character){
        NodoMat2 q = arriba(f, c);
        NodoMat2 p = izquierda(f, c);
        NodoMat2 nuevo = new NodoMat2(f, c, urlPasto, Character);
        nuevo.sigfil = q.sigfil;
        q.sigfil = nuevo;
        nuevo.sigcol = p.sigcol;
        p.sigcol = nuevo;
    }
    
    void imprimir(NodoMat2 M){
        NodoMat2 aux=M.sigcol;
        System.out.print(M.URLImage+" ");
        while(aux.col!=M.col){
            System.out.print(aux.col+" ");
            aux=aux.sigcol;
        }
    }
}
