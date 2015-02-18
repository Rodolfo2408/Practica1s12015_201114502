/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

/**
 *
 * @author Rodolfo
 */
public class ListaPlanta {
    Planta primero, ultimo;
    
    public ListaPlanta(Planta nuevo){
       primero = ultimo = nuevo;
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
}
