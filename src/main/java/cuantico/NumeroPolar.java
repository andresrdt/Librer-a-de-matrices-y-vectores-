/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuantico;

/**
 *
 * @author rodri
 */
public class NumeroPolar {
    private double angulo;
    private double radio;

    public NumeroPolar(double angulo, double radio) {
        this.angulo = angulo;
        this.radio = radio;
    }

    public double getAngulo() {
        return angulo;
    }

    public double getRadio() {
        return radio;
    }


    @Override
    public String toString() {
        return "NumeroPolar{" + "angulo=" + angulo + ", radio=" + radio + '}';
    }
}
