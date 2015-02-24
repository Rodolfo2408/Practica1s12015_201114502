/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

/**
 *
 * @author Rodolfo
 */
public class ListaZombie {
    
    Zombie inicio;
    Zombie ultimo;
    
    public ListaZombie(Zombie nuevo){
        inicio = ultimo = nuevo;
    }
    
    public void add(Zombie nuevo){
        Zombie piv = inicio;
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
        Zombie aux = inicio;      
        if(inicio != null){
            while(aux!= null){
                if(aux.nombre.equals(nombre)){
                   if(inicio.nombre.equals(nombre) && inicio.siguiente == null){
                        inicio =null;
                        ultimo=null;
                        //System.out.println("Unico Contacto Borrado");
                        return true;
                   }
                   else if(inicio.nombre.equals(nombre)){
                        inicio = inicio.siguiente;
                        inicio.anterior =null;
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
        Zombie pivot = inicio;
        while (pivot != null){
            if (pivot.getDato().equalsIgnoreCase(dato)){
                return true;
            }            
            pivot = pivot.getSiguiente();
        }
        return false;
    }
    
    public void recorre(){
        Zombie pivot = this.inicio;
        while (pivot != null){
            System.out.println(pivot.nombre);
            System.out.println(pivot.imagenURL);
            pivot = pivot.getSiguiente();
        }
    }
    
    public void graficar(){
        
    }
}
