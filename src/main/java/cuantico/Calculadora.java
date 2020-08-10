/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuantico;

import java.text.DecimalFormat;

/**
 *
 * @author rodri
 */
public class Calculadora {
    public  static NumeroComplejo suma(NumeroComplejo c1, NumeroComplejo c2) {
        return new NumeroComplejo(c1.getpReal() + c2.getpReal(), c1.getpImg() + c2.getpImg());
    }
    public static NumeroComplejo producto(NumeroComplejo c1, NumeroComplejo c2) {
        double pReal = (c1.getpReal() * c2.getpReal()) - (c1.getpImg() * c2.getpImg());
        double pImg = (c1.getpReal() * c2.getpImg()) + (c2.getpReal() * c1.getpImg());
        return new NumeroComplejo(pReal, pImg);
    }
    public  static NumeroComplejo resta(NumeroComplejo c1, NumeroComplejo c2) {
        return new NumeroComplejo(c1.getpReal() - c2.getpReal(), c1.getpImg() - c2.getpImg());
    }
    public  static NumeroComplejo division(NumeroComplejo c1, NumeroComplejo c2) {
        double realNumerador = (c1.getpReal() * c2.getpReal()) + (c1.getpImg() * c2.getpImg());
        double imgNumerador = (c2.getpReal() * c1.getpImg()) - (c1.getpReal() * c2.getpImg());
        double denominador = Math.pow(c2.getpReal(), 2) + Math.pow(c2.getpImg(), 2);
        return new NumeroComplejo(Math.round((realNumerador / denominador) * 100.0) / 100.0, Math.round((imgNumerador / denominador) * 100.0) / 100.0);
    }
     public static double modulo(NumeroComplejo a) {
        double real = Math.sqrt(Math.pow(a.getpReal(), 2) + Math.pow(a.getpImg(), 2));
        return real;
    }
    public static NumeroComplejo conjugado(NumeroComplejo a) {
        NumeroComplejo nc = new NumeroComplejo(a.getpReal(),-a.getpImg());
        return nc;
    }
    public static String cartesianaAPolar(NumeroComplejo c1){
        double p = Math.sqrt(Math.pow(c1.getpReal(), 2) + Math.pow(c1.getpImg(), 2));
        double t = Math.atan2(c1.getpImg(), c1.getpReal());
        DecimalFormat df = new DecimalFormat("#.##");
        return "(" + df.format(p) + ", " + df.format(t) + ")";
    }
    
    public static  NumeroComplejo polarACartesiana(double p, double t){
         double a = p * Math.cos(t);
        double b = p * Math.sin(t);
        return new  NumeroComplejo(Math.round(a * 100.0) / 100.0, Math.round(b * 100.0) / 100.0);

    }
     public static double fase(NumeroComplejo a){
        double rads = Math.atan(a.getpImg()/a.getpReal());
        double angulo = Math.toDegrees(rads);
        return angulo;
    }
     public static void main(String[] args) {
        Calculadora app = new Calculadora();
        NumeroComplejo a = new NumeroComplejo(4,2);
        NumeroComplejo b = new NumeroComplejo(0,1);
        NumeroPolar c = new NumeroPolar(36.86989764584402,5);
        System.out.println("suma :" + app.suma(a, b));
        System.out.println("resta :" + app.resta(a, b));
        System.out.println("Producto :" + app.producto(a, b));
        System.out.println("division :"+app.division(a, b));
        System.out.println("Modulo :" + app.modulo(a));
        System.out.println("Conjugado :" + app.conjugado(a));
        System.out.println("Cartesiano a Polar :" + app.cartesianaAPolar(a));
        System.out.println("Fase :" + app.fase(a));
    }
}
