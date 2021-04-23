package practico1.vista;

import practico1.modelo.Linea;

import java.awt.*;
import java.util.ArrayList;

public class DibujoLinea implements IDibujo {

    private ArrayList<Linea> lineas;


    public DibujoLinea(ArrayList<Linea> lineas) {
        this.lineas = lineas;
    }

    public void dibujar(Graphics g) {
        if (lineas != null) {
            for (Linea linea : lineas) {
                g.drawLine(linea.getX(), linea.getY(),
                        linea.getX(), 400 - linea.getAlto());
            }
        }
    }
}
