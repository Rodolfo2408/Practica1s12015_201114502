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
    
    public void add(Lista_Cabecera col, Lista_Cabecera fil, String tipo, int x, int y, String pic, int danio, int ataque){
        NodoMat actX=null,actY=null;
        NodoMat nuevo = new NodoMat(tipo,x,y,pic,danio,ataque);
        Nodo_Cabecera auxC,auxF;
        auxC=col.buscar(y);     
        auxF=fil.buscar(x);
        if(auxC.interior==null){
            auxC.interior=nuevo;
        }else{
            actX=ubicarColumna(auxC.interior,nuevo,x);
        }
        if(auxF.interior==null){
            auxF.interior=nuevo;
        }else{
            actY=ubicarFila(auxF.interior,nuevo,y);
        }
        if(actX!=null && actY!=null){
            ubicarProfundidad(actX,nuevo);
        }
    }
    
    private NodoMat ubicarColumna(NodoMat primero, NodoMat nuevo, int x){
        NodoMat aux=primero;
        while(aux.abajo!=null && aux.posx!=x){
            aux=aux.abajo;
        }
        if(aux.posx==x){
            return aux;
        }else{
            aux.abajo=nuevo;
            nuevo.arriba=aux;
            return null;
        }
    }
    
    private NodoMat ubicarFila(NodoMat primero, NodoMat nuevo, int y){
        NodoMat aux = primero;
        while(aux.derecha!=null && aux.posy!=y){
            aux=aux.derecha;
        }
        if(aux.posy==y){//verificar
            return aux;
            //ubicarProfundidad(aux,nuevo);
        }else{
            aux.derecha = nuevo;
            nuevo.izquierda = aux;
            return null;
        }
    }
    
    private void ubicarProfundidad(NodoMat base, NodoMat nuevo){
        NodoMat aux = base;
        while(aux.atras!=null){
            aux=aux.atras;
        }
        aux.atras=nuevo;
        nuevo.adelante=aux;
    }
    
    public void recorrer(Lista_Cabecera columna, Lista_Cabecera fila){
        recColumna(columna);
        recFila(fila);
    }
    
    private void recColumna(Lista_Cabecera columna){
        Nodo_Cabecera aux=columna.primero;
        while(aux!=null){
            System.out.println("<"+aux.id+">");
            NodoMat aux1=aux.interior;
            while(aux1!=null){
                System.out.print("("+aux1.posx+","+aux1.posy+") ");
                aux1=aux1.abajo;
            }
            System.out.println();
            aux=aux.sig;
        }
    }
    private void recFila(Lista_Cabecera fila){
        Nodo_Cabecera aux=fila.primero;
        while(aux!=null){
            System.out.println("<"+aux.id+">");
            NodoMat aux1=aux.interior;
            while(aux1!=null){
                System.out.println("["+aux1.posx+","+aux1.posy+"] ");
                recProfundidad(aux1);//rev
                System.out.println();//rev
                aux1=aux1.derecha;
            }
            System.out.println();
            aux=aux.sig;
        }
    }
    
    private void recProfundidad(NodoMat base){
        NodoMat aux=base;
        if(aux.atras!=null){
            while(aux!=null){
                System.out.print("ยก"+aux.personaje+"! ");
                aux=aux.atras;
            }
        }
    }
}
