/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

import java.util.*;
import javax.swing.*;

/**
 *
 * @author Rodolfo
 */
public class PilaZombies {
    Queue<Zombie> cola;
    Stack<Planta> pila;
    
    class NodoPila{
        Object obj;
        NodoPila sig;
        
        public NodoPila(){
            obj = sig = null;
        }
        
        public NodoPila(Object o){
        obj=o;
        sig=null;
        }

        public NodoPila(Object o,NodoPila s){
            obj=o;
            sig=s;
        }

        public NodoPila getSig(){
            return sig;
        }

        public Object getObjeto(){
            return obj;
        }
    }
    
    NodoPila tope; 

    public PilaZombies(){ 
        NodoPila nodo = new NodoPila(); 
    } 

    public void Push(Object p){ 
        NodoPila aux = new NodoPila(p); 
        aux.sig=tope; 
        tope=aux; 
    } 

    public int Pop(){ 
        if(vacio(tope)==true){ 
            NodoPila aux = tope;  
            tope=tope.getSig(); 
            //mostrar(aux); 
        }else{ 
            System.out.println("La pila Esta Vacia"); 
        } 
        return 0; 
    } 

    public boolean vacio (NodoPila tope){ 
        if(tope!=null){ 
            return true; 
        }return false; 
    }

    /*
    public void mostrar(NodoPila aux){ 
        Zombie xxx = (Zombie)aux.getObjeto(); 
        System.out.println("Nombre: "+xxx.getNombre()); 
        System.out.println("Apellido: "+xxx.getApellido()); 
        System.out.println("Edad: "+xxx.getEdad()); 
    } 
    */
}

