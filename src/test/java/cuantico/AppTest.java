package cuantico;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void sumaNumComplejos()
    {
       NumeroComplejo c1= new NumeroComplejo(3,-1);
       NumeroComplejo c2 = new NumeroComplejo(1, 4);
       NumeroComplejo result = Calculadora.suma(c1, c2);
       NumeroComplejo expected = new NumeroComplejo(4, 3);
       assertEquals(expected, result);
    }
    @Test
    public void ProductoNumComplejos()
    {
        NumeroComplejo c1 = new NumeroComplejo(3, -2);
        NumeroComplejo c2 = new NumeroComplejo(1, 2);
        NumeroComplejo result = Calculadora.producto(c1, c2);
        NumeroComplejo expected = new NumeroComplejo(7, 4);
        assertEquals(expected, result);
    }
    @Test
    public void restaNumComplejos()
    {
        NumeroComplejo c1 = new NumeroComplejo(5, 7);
        NumeroComplejo c2 = new NumeroComplejo(3, 1);
        NumeroComplejo result = Calculadora.resta(c1, c2);
        NumeroComplejo expected = new NumeroComplejo(2, 6);
        assertEquals(expected, result);
    }
    @Test
    public void DivisionNumComplejos()
    {
        NumeroComplejo c1 = new NumeroComplejo(-2, 1);
        NumeroComplejo c2 = new NumeroComplejo(1, 2);
        NumeroComplejo result = Calculadora.division(c1, c2);
        NumeroComplejo expected = new NumeroComplejo(0, 1);
        assertEquals(expected, result);
    }
    @Test
    public void ModuloNumComplejos()
    {
        NumeroComplejo c1 = new NumeroComplejo(1, -1);
        double expected = Math.sqrt(2);
        double result = c1.modulo();
        assertEquals(expected, result, 0);
    }
    @Test
    public void ConjugadoNumComplejos()
    {
       NumeroComplejo c1 = new NumeroComplejo(2, 5);
       NumeroComplejo expected = new NumeroComplejo(2, -5);
       NumeroComplejo result = c1.conjugado();
       assertEquals(expected, result);
    }
    @Test
    public void polarCartesiano()
    {
        NumeroComplejo result = Calculadora.polarACartesiana(Math.sqrt(2), Math.PI / 4.0);
        NumeroComplejo expected = new NumeroComplejo(1, 1);
        assertEquals(expected, result);
    }
    @Test
    public void CartesianoPolar()
    {
        NumeroComplejo c1 = new NumeroComplejo(1, 1);
        String expected = "(1.41, 0.79)";
        String result = Calculadora.cartesianaAPolar(c1);
        assertEquals(expected, result);
    }
    @Test
    public void Fase()
    {
        NumeroComplejo c1 = new NumeroComplejo(1, 1);
        double expected = Math.PI / 4;
        double result = c1.getFase();
        assertEquals(expected, result, 0);
    }
}
