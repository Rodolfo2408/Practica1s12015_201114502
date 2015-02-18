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
    public int maximo;
    public Planta[] plantas;
    public int inicio, fin;
    
    public ColaPlantas(){
        this.plantas = new Planta[maximo + 1];
        inicio = fin = 0;
    }
    
    public boolean Empty(){
        return inicio == fin;
    }
    
    public boolean Full(){
        return tamanio() == maximo + 1;
    }
    
    public void add(Planta P){ //agregar en cola
        if(Full()){
            JOptionPane.showMessageDialog(null, "Cola Llena");
        }else{
            fin = (fin+1) % maximo;
            plantas[fin] = P;
        }
    }
    
    public Planta poll(){ //eliminar en cola
        Planta p = null;
        if(Empty()){
            JOptionPane.showMessageDialog(null, "Cola Vacia");
        }else{
            inicio = (inicio+1) % maximo;
            p = plantas[inicio];
        }
        return p;
    }
    
    public int tamanio(){
        return (fin-inicio+maximo)%maximo;
    }
    
//    public void peek(){
//        if(Empty()){
//            JOptionPane.showMessageDialog(null, "Cola Vacia, No hay nada que mostrar");
//        }else{
//            
//        }
//    }
}
