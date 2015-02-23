/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

/**
 *
 * @author Rodolfo
 */
public class Lista_Cabecera {
    Nodo_Cabecera primero;
    Nodo_Cabecera ultimo;
    
    public Lista_Cabecera(){
        primero=null;
        ultimo=null;
    }
    
    public void add(int id){
        Nodo_Cabecera nuevo=new Nodo_Cabecera(id);
        if(primero==null){
            primero=nuevo;
            ultimo=nuevo;
        }else{
            ultimo.sig=nuevo;
            nuevo.ant=ultimo;
            ultimo=nuevo;
        }
    }
    
    public boolean vacia(){
        if(primero==null){
            return true;
        }else{
            return false;
        }
    }
    
    public Nodo_Cabecera buscar(int id){
        Nodo_Cabecera aux=primero;
        while(aux.sig!=null && aux.id!=id){
            aux=aux.sig;
        }
        if(aux.id==id){
            return aux;
        }else{
            return null;
        }
    }
    
    public void recorrer(){
        Nodo_Cabecera auxiliar;
        auxiliar=primero;
        while(auxiliar!=null){
            System.out.println(auxiliar.id+" ");
            auxiliar=auxiliar.sig;
        }
    }
}
