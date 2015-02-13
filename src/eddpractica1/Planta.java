/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

/**
 *
 * @author Rodolfo
 */
public class Planta {
    
    String nombre, tipo, ataque, defensa, imagenURL;
    int rango;
    int posX, posY, danio, puntos;
    boolean vivo;

    public Planta(){}
    
    public Planta(String nombre, String tipo, String defensa, String ataque, int rango, int posX, int posY, int danio, int puntos, boolean vivo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataque = ataque;
        this.defensa = defensa;
        this.rango = rango;
        this.posX = posX;
        this.posY = posY;
        this.danio = danio;
        this.puntos = puntos;
        this.vivo = vivo;
        this.vivo=true;
    }
    
}
