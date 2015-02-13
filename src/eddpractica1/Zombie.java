/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

/**
 *
 * @author Rodolfo
 */
public class Zombie {
    
    boolean vivo;
    int posX;
    int posy;
    String tipo;
    int rango;
    int daxo;
    String descripcion, imagenURLZ;
    Zombie siguiente;
    Zombie anterior;
   
    public Zombie(){}
    public Zombie(int posX, int posy, String tipo, int rango, int daxo) {
        this.posX = posX;
        this.posy = posy;
        this.tipo = tipo;
        this.rango = rango;
        this.daxo = daxo;
        this.vivo = true;
        this.siguiente = null;
        this.anterior = null;
    }

    public Zombie(int posX, int posy, String tipo, int rango, int daxo, String descripcion) {
        this.posX = posX;
        this.posy = posy;
        this.tipo = tipo;
        this.rango = rango;
        this.daxo = daxo;
        this.descripcion = descripcion;
        this.vivo = true;
        this.siguiente = null;
        this.anterior = null;
    }
    
}
