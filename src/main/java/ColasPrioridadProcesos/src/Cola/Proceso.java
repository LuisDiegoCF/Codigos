/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cola;

/**
 *
 * @author Jonathan
 */
public class Proceso {
    
    private int tamano;
    private boolean prioridad;
    private Proceso anterior;
    private Proceso siguiente;

    public Proceso(int tamano, boolean prioridad) {
        this.tamano = tamano;
        this.prioridad = prioridad;
    }

    public boolean isPrioridad() {
        return prioridad;
    }

    public void setPrioridad(boolean prioridad) {
        this.prioridad = prioridad;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public Proceso getAnterior() {
        return anterior;
    }

    public void setAnterior(Proceso anterior) {
        this.anterior = anterior;
    }

    public Proceso getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Proceso siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "{T=" + tamano + " P=" + (prioridad ? "Si" : "No") + "}";
    }

    
    
}
