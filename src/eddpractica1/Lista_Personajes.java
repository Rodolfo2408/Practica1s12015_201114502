/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

/**
 *
 * @author Rodolfo
 */
public class Lista_Personajes {
    Personaje inicio, ultimo;
    
    public Lista_Personajes(Personaje nuevo){
        this.inicio = nuevo;
        this.ultimo = nuevo;
    }
    
    public void add(Personaje nuevo){
        Personaje temp=inicio;
        while(temp != null){
            if(temp.siguiente==null){
                temp.siguiente=nuevo;
                temp.anterior=nuevo;
                nuevo.anterior=ultimo;
                ultimo = nuevo;
                break;
            }
            temp=temp.siguiente;
        }
    }
    
    public String recorrer(){
        Personaje pivote = this.inicio;
        String tipo="";
        while(pivote != null){
            pivote = pivote.getSiguiente();
        }
        return pivote.nombre;
    }
    
    public boolean delete(String nombre){
        Personaje aux = inicio;
        if(inicio != null){
            while(aux != null){
                if(aux.nombre.equals(nombre)){
                    if(inicio.nombre.equals(nombre) && inicio.siguiente == null){ //borra unico nodo
                        inicio = null;
                        ultimo = null;
                        return true;
                    }else if(inicio.nombre.equals(nombre)){ //borra el nodo inicial
                        inicio = inicio.siguiente;
                        inicio.anterior = null;
                        return true;
                    }else if(ultimo.nombre.equals(nombre)){ //borra el final
                        ultimo = ultimo.anterior;
                        ultimo.siguiente = null;
                        return true;
                    }else{ //borra el medio u otro
                        aux.siguiente.anterior = aux.anterior;
                        aux.anterior.siguiente = aux.siguiente;
                        return true;
                    }
                }
                aux = aux.siguiente;
            }
            return false;
        }
        return false;
    }
}
