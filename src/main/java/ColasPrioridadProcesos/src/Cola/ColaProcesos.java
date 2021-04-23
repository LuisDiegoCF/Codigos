/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Cola;

import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jonathan
 */
/*public class ColaProcesos implements Runnable {

    private Proceso primero;
    private Proceso ultimo;
    private Proceso proceso;

    private int cantidadElementosCola = 0;

    private int cuota = 10;

    private int procesosActuales = 0, procesosMeta = 50;

    public ColaProcesos() {
    }

    public boolean getRandomBoolean() {
        return Math.random() < 0.5;
    }

    public int getRandomInt() {
        return (int) (Math.random() * 100) + 1;
    }

   public void iniciar() throws InterruptedException, Exception {
        if (procesosActuales < procesosMeta) {
            while (cantidadElementosCola < 10) {
                int tamano = getRandomInt();
                boolean prioridad = getRandomBoolean();
                if (procesoPrioridad() == null) {
                    System.out.println("Cola esta SIN P. ->");
                    insertar(tamano, prioridad);
                } else {
                    System.out.println("Cola esta CON P. ->");
                    insertar(tamano, false);
                }
                Thread.sleep(1000);
                System.out.println("//------------------------------------------");
                System.out.println("//COLA: " + imprimir());
                System.out.println("//------------------------------------------");
                System.out.println("MENOR= " + (getProcesoMenor() == null ? "null" : getProcesoMenor().toString()));
                System.out.println("PRIORIDAD= " + (procesoPrioridad() == null ? "null" : procesoPrioridad().toString()));
            }
            System.out.println("Eliminar: " + eliminar().toString());
            System.out.println("//------------------------------------------");
            System.out.println("//COLA: " + imprimir());
            System.out.println("//------------------------------------------");
        }
    }

    private Proceso procesoPrioridad() {
        if (estaVacio()) {
            System.out.println("Cola vacia.");
            return null;
        }
        Proceso aux = primero;
        while (aux != null) {
            if (aux.isPrioridad()) {
                return aux;
            }
            aux = aux.getSiguiente();
        }
        return null;
    }

    public void insertar(int tamano, boolean prioridad) {
        System.out.println("Ha insertar: T= " + tamano + " P= " + (prioridad ? "Si" : "No"));

        Proceso nuevo = new Proceso(tamano, prioridad);

        if (cantidadElementosCola == 0) {
            primero = nuevo;
            ultimo = nuevo;
        } else if (nuevo.isPrioridad()) {
            nuevo.setSiguiente(primero);
            primero.setAnterior(nuevo);
            primero = nuevo;
        } else if (nuevo.getTamano() < primero.getTamano() //                    && !primero.isPrioridad()
                ) {
            primero.setAnterior(nuevo);
            nuevo.setSiguiente(primero);
            primero = nuevo;
        } else if (nuevo.getTamano() > ultimo.getTamano()) {
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
        } else {
            Proceso procesoAMover = getProceso(tamano);

            nuevo.setSiguiente(procesoAMover);
            nuevo.setAnterior(procesoAMover.getAnterior());

            procesoAMover.setAnterior(nuevo);
            nuevo.getAnterior().setSiguiente(nuevo);
        }
        cantidadElementosCola++;
        procesosActuales++;
    }

    private Proceso getProceso(int obj) {
        Proceso procesoAux = primero;
        while (!(procesoAux.getTamano() > obj)) {
            procesoAux = procesoAux.getSiguiente();
        }
        return procesoAux;
    }

    public Proceso eliminar() throws Exception {
        if (cantidadElementosCola == 0) {
            throw new Exception("La cola esta vacia");
        }
        Proceso procesoAEliminar = getProcesoMenor();
        Proceso contenido = procesoAEliminar;

        //Proceso de eliminacion
        if (primero == ultimo) {
            primero = null;
            ultimo = null;
            cantidadElementosCola = 0;
            return contenido;
        }

        if (procesoAEliminar == primero) {
            primero = procesoAEliminar.getSiguiente();
            primero.setAnterior(null);
            procesoAEliminar.setSiguiente(null);
            cantidadElementosCola--;
            return contenido;
        }

        if (procesoAEliminar == ultimo) {
            ultimo = procesoAEliminar.getAnterior();
            ultimo.setSiguiente(null);
            procesoAEliminar.setAnterior(null);
            cantidadElementosCola--;
            return contenido;
        }

        procesoAEliminar.getAnterior().setSiguiente(procesoAEliminar.getSiguiente());
        procesoAEliminar.getSiguiente().setAnterior(procesoAEliminar.getAnterior());

        procesoAEliminar.setSiguiente(null);
        procesoAEliminar.setAnterior(null);
        cantidadElementosCola--;
        return contenido;
    }

    public int consultar() throws Exception {
        if (cantidadElementosCola == 0) {
            throw new Exception("La cola esta vacia");
        }
        Proceso proceso = getProcesoMenor();
        return proceso.getTamano();
    }

    private Proceso getProcesoMenor() {
        if (cantidadElementosCola == 0) {
            return null;
        }
        if (cantidadElementosCola == 1) {
            return primero;
        }
        if (procesoPrioridad() == null) {
            Proceso menor = primero;
            Proceso procesoAux = primero.getSiguiente();
            while (procesoAux != null) {
                if (procesoAux.getTamano() < menor.getTamano()) {
                    menor = procesoAux;
                }
                procesoAux = procesoAux.getSiguiente();
            }
            return menor;
        } else {
            return procesoPrioridad();
        }
    }

    public boolean estaVacio() {
        return cantidadElementosCola == 0;
    }

    public String imprimir() {
        Proceso aux = primero;
        String resultado = "";
        while (aux != null) {
            resultado += aux.toString() + " - ";
            aux = aux.getSiguiente();
        }
        return resultado;
    }

    @Override
    public void run() {
        try {
            iniciar();
        } catch (InterruptedException ex) {
            Logger.getLogger(ColaProcesos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ColaProcesos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}*/
