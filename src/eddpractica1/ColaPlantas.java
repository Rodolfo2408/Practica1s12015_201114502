/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

import javax.swing.*;
/**
 *
 * @author Rodolfo
 */
public class ColaPlantas {
    
    public class Node {
        Object elem;
        Node Next;

        public Node(Object o) {
            elem = o;
            Next = null;
        }
        
        public Object getObjeto(){
            return elem;
        }
    }

    Node first;
    Node end;
    int size;

    public ColaPlantas() {
        end = null;
        size = 0;
    }

    public void add(Object o) {
        Node new_node = new Node(o);
        if (first == null) {
            first = new_node;
            end = new_node;
        }else{
            end.Next = new_node;
            end = new_node;
        }
        size++;
    }; // inserts an object 

    public int poll(){
//        if (first == null){
//          return null;
//        }
        if(isEmpty() == false){
            Object o = first.elem;
            first = first.Next;
            System.out.println(first.elem);
            mostrar(first);
            size=-1;
        }else{
            System.out.println("La Cola Esta Vacia"); 
        }
        return 0;
        
//        public int Pop(){ 
//        if(vacio(tope)==true){ 
//            PilaZombies.NodoPila aux = tope;  
//            tope=tope.getSig(); 
//            mostrar(aux); 
//        }else{ 
//            System.out.println("La pila Esta Vacia"); 
//        } 
//        return 0; 
//        } 
    } // gets the object from the queue

    public boolean isEmpty() {
        return (size == 0);
    }

    public int size() {
        return size;
    }

    public Object first() {
        if (first == null){
          return null;
        }else{
          return first.elem;
        }
   }
    
    public void mostrar(Node aux){
        Planta xxx = (Planta)aux.getObjeto(); 
        System.out.println("Nombre: "+xxx.nombre); 
        System.out.println("Imagen: "+xxx.imagenURL); 
        System.out.println("Tipo: "+xxx.tipo); 
    }
}
