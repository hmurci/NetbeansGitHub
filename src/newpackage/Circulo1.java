/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
/*
 * Ejercicio de Documentación
 * Circulos - Versión sin información
 */

/**
 *
 * @author ASIR 7L
 */
public class Circulo1 {
     private double centroX;
    private double centroY;
    private double radio;

    /**
     * contructor
     * @param x centro: coordenada x
     * @param y centro: coordenada y
     * @param r radio
     */
    public Circulo1(double x, double y, double r) {
        centroX = x;
        centroY = y;
        radio = r;
        
    }

    /**
     * Getter (Consigue el atributo indicado)
     * @return centro: coordenada x
     */
    public double getCentroX() {
        return centroX;
    }

    /**
     *  Calcula la longitud de la circunferencia
(perímetro del círculo).
     * @return perimetro
     */
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    /**
     *  Desplaza el círculo a otro lugar.
     * @param despX movimiento en el eje x
     * @param despY movimiento en el eje y
     */
    public void mueve(double despX, double despY) {
        centroX = centroX + despX;
        centroY = centroY + despY;
    }
}
