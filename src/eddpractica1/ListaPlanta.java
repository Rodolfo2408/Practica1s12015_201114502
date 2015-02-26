/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

import static eddpractica1.ListaZombie.tamanio;

/**
 *
 * @author Rodolfo
 */
public class ListaPlanta {
    Planta primero, ultimo;
    
    public ListaPlanta(Planta nuevo){
       primero = nuevo;
       ultimo = nuevo;
    }
    
    public void add(Planta nuevo){
        Planta piv = primero;
        while(piv != null){
            if(piv.siguiente == null){
                piv.siguiente = nuevo;
                nuevo.anterior = ultimo;
                ultimo = nuevo;
                break;
            }
            piv = piv.getSiguiente();
        }
    }
    
    public boolean delete(String nombre){
        Planta aux = primero;      
        if(primero != null){
            while(aux!= null){
                if(aux.nombre.equals(nombre)){
                   if(primero.nombre.equals(nombre) && primero.siguiente == null){
                        primero =null;
                        ultimo=null;
                        //System.out.println("Unico Contacto Borrado");
                        return true;
                   }
                   else if(primero.nombre.equals(nombre)){
                        primero = primero.siguiente;
                        primero.anterior =null;
                        //System.out.println("inicio borrado");
                        return true;
                    }
                   else if(ultimo.nombre.equals(nombre)){
                        ultimo = ultimo.anterior;
                        ultimo.siguiente = null;
                        //System.out.println("final borrado");
                        return true;
                    }else{
                        aux.siguiente.anterior = aux.anterior;
                        aux.anterior.siguiente = aux.siguiente;
                        //System.out.println("medio borrado");
                        return true;
                    }
                }aux = aux.siguiente;
            }return false;
        }return false;
    }
    
    public boolean buscarDato(String dato){
        Planta pivot = primero;
        while (pivot != null){
            if (pivot.getDato().equalsIgnoreCase(dato)){
                return true;
            }            
            pivot = pivot.getSiguiente();
        }
        return false;
    }
    
    public void recorre(){
        Planta pivot = this.primero;
        while (pivot != null){
            System.out.println(pivot.nombre);
            pivot = pivot.getSiguiente();
        }
    }
    
    public int Size(){
        Planta piv = this.primero;
        while(piv != null){
            tamanio++;
            piv = piv.siguiente;
        }
        return tamanio;
    }
    
    int retorno;
    public Planta nodo(int clave){
        Planta aux = this.primero;
        int t = Size();
        for(int i=0; i<t; i++ ){
            if(retorno == clave){
                return aux;
            }
            retorno++;
            aux = aux.siguiente;
        }
        return null;
    }
    
    public String imagenes(){
        Planta aux = primero;
        String URL="";
        for(int i=0; i<Size(); i++){
            URL = aux.imagenURL;
            return URL;
        }
        return null;
    }
}
