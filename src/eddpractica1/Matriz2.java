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
    NodoMat2 m;
    
    public void crear(int f,int c){
        m=new NodoMat2(0,0,0);
        m.sigfil=m;
        m.sigcol=m;
        int i=1;
        NodoMat2 q=m;
        while(i<=f){
            NodoMat2 nuevo=new NodoMat2(0,i,0);
            q.sigfil=nuevo;
            nuevo.sigcol=nuevo;
            q=nuevo;
            i++;
        }
        q.sigfil=m;
        i=1;
        q=m;
        while(i<=c){
            NodoMat2 nuevo=new NodoMat2(0,0,i);
            q.sigcol=nuevo;
            nuevo.sigfil=nuevo;
            q=nuevo;
            i++;
        }
        q.sigcol=m;
    }
    
    public NodoMat2 arriba(int f,int c){
        NodoMat2 aux=m.sigcol;
        while(aux.col!=c){
            aux=aux.sigcol;
        }
        NodoMat2 aux1=aux.sigfil;
        NodoMat2 aux2=aux1.sigfil;
        NodoMat2 aux3=aux;
        while((aux1.fil<f)&&(aux2.fil!=0)){
            aux=aux1;
            aux1=aux1.sigfil;
            aux2=aux2.sigfil;
        }
        if(aux1.fil<f){
            return aux1;
        }else{
            return aux;
        }
    }
    
    public NodoMat2 izquierda(int f,int c){
        NodoMat2 aux=m.sigfil;
        while(aux.fil!=f){
            aux=aux.sigfil;
        }
        NodoMat2 aux1=aux.sigcol;
        NodoMat2 aux2=aux1.sigcol;
        NodoMat2 aux3=aux;
        while((aux1.col<c)&&(aux2.col!=0)){
            aux=aux1;
            aux1=aux1.sigcol;
            aux2=aux2.sigcol;
        }
        if(aux1.col<c){
            return aux1;
        }else{
            return aux;
        }
    }
    
    public void adicionar(int i,int f,int c){
        NodoMat2 q=arriba(f,c);
        NodoMat2 p=izquierda(f,c);
        NodoMat2 nuevo=new NodoMat2(i,f,c);
        nuevo.sigfil=q.sigfil;
        q.sigfil=nuevo;
        nuevo.sigcol=p.sigcol;
        p.sigcol=nuevo;
        }
    
    public void imprimir(NodoMat2 M){
        NodoMat2 o;
        int nca=0,ncc=0,nt=0;
        NodoMat2 e,g,h;
        NodoMat2 aux=M.sigcol;
        System.out.print(M.info+" ");
        while(aux.col!=M.col){
            System.out.print(aux.col+" ");
            aux=aux.sigcol;
        }
        System.out.println("" );
        NodoMat2 aux2=M.sigcol;
        aux=M.sigfil;
        while(aux.fil!=M.fil){
            System.out.print(aux.fil+" ");
            o=aux;
            e=aux.sigcol;

            while(o!=e){
                int nc=e.col;
                nt=nc;
                int nf=e.fil;
                if(nf==nca){
                    nc=nc-ncc;
                }
                for(int i=1;i<nc;i++){
                    System.out.print(" ");
                }
                System.out.print(e.info+" ");
                e=e.sigcol;
                nca=nf;
                ncc=nt;
            }
            System.out.println(" ");
            aux=aux.sigfil;
        }
    }
}
