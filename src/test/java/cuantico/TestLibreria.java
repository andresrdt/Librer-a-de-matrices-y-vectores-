/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuantico;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andy
 */
public class TestLibreria {
      private OperacionesVectoresMatrices operador = new OperacionesVectoresMatrices();

    @Test
    public void adicionVectorial() {

        NumeroComplejo[] lista = new NumeroComplejo[2];
        NumeroComplejo[] listaDos = new NumeroComplejo[2];
        NumeroComplejo[] esperado = new NumeroComplejo[2];
        lista[0] = new NumeroComplejo(0, 1);
        lista[1] = new NumeroComplejo(1, 0);
        listaDos[0] = new NumeroComplejo(1, 0);
        listaDos[1] = new NumeroComplejo(0, 1);
        esperado[0] = new NumeroComplejo(1, 1);
        esperado[1] = new NumeroComplejo(1, 1);
        NumeroComplejo[] respuesta = operador.adicionVectorial(lista, listaDos);
        assertEquals(respuesta, esperado);
    }

    @Test
    public void inversaVectorial() {

        NumeroComplejo[] lista = new NumeroComplejo[2];
        NumeroComplejo[] esperado = new NumeroComplejo[2];
        lista[0] = new NumeroComplejo(1, -1);
        lista[1] = new NumeroComplejo(-1, 1);
        esperado[0] = new NumeroComplejo(-1, 1);
        esperado[1] = new NumeroComplejo(1, -1);
        NumeroComplejo[] respuesta = operador.inversoAditivo(lista);
        assertEquals(respuesta, esperado);
    }

    @Test
    public void EscalarVectorial() {

        NumeroComplejo[] lista = new NumeroComplejo[2];
        NumeroComplejo[] esperado = new NumeroComplejo[2];
        lista[0] = new NumeroComplejo(1, 2);
        lista[1] = new NumeroComplejo(3, 4);
        esperado[0] = new NumeroComplejo(3, 6);
        esperado[1] = new NumeroComplejo(9, 12);
        NumeroComplejo nc = new NumeroComplejo(3, 0);
        NumeroComplejo[] respuesta = operador.multiplicacionEscalarVectorial(lista, nc);
        assertEquals(respuesta, esperado);
    }

    @Test
    public void adicionMatriz() {

        NumeroComplejo[][] lista = new NumeroComplejo[2][2];
        NumeroComplejo[][] listaDos = new NumeroComplejo[2][2];
        NumeroComplejo[][] esperado = new NumeroComplejo[2][2];
        lista[0][0] = new NumeroComplejo(1, 0);
        lista[0][1] = new NumeroComplejo(0, 1);
        lista[1][0] = new NumeroComplejo(1, 0);
        lista[1][1] = new NumeroComplejo(0, 1);
        listaDos[0][0] = new NumeroComplejo(0, 1);
        listaDos[0][1] = new NumeroComplejo(1, 0);
        listaDos[1][0] = new NumeroComplejo(0, 1);
        listaDos[1][1] = new NumeroComplejo(1, 0);
        esperado[0][0] = new NumeroComplejo(1, 1);
        esperado[0][1] = new NumeroComplejo(1, 1);
        esperado[1][0] = new NumeroComplejo(1, 1);
        esperado[1][1] = new NumeroComplejo(1, 1);
        NumeroComplejo[][] respuesta = operador.adicionMatriz(lista, listaDos);
        assertEquals(respuesta, esperado);
    }

    @Test
    public void inversaMatriz() {

        NumeroComplejo[][] lista = new NumeroComplejo[2][2];
        NumeroComplejo[][] esperado = new NumeroComplejo[2][2];
        lista[0][0] = new NumeroComplejo(1, 1);
        lista[0][1] = new NumeroComplejo(1, 1);
        lista[1][0] = new NumeroComplejo(1, 1);
        lista[1][1] = new NumeroComplejo(1, 1);
        esperado[0][0] = new NumeroComplejo(-1, -1);
        esperado[0][1] = new NumeroComplejo(-1, -1);
        esperado[1][0] = new NumeroComplejo(-1, -1);
        esperado[1][1] = new NumeroComplejo(-1, -1);
        NumeroComplejo[][] respuesta = operador.inversaMatriz(lista);
        assertEquals(respuesta, esperado);
    }

    @Test
    public void EscalarMatriz() {

        NumeroComplejo[][] lista = new NumeroComplejo[2][2];
        NumeroComplejo[][] esperado = new NumeroComplejo[2][2];
        lista[0][0] = new NumeroComplejo(1, 1);
        lista[0][1] = new NumeroComplejo(1, 1);
        lista[1][0] = new NumeroComplejo(1, 1);
        lista[1][1] = new NumeroComplejo(1, 1);
        esperado[0][0] = new NumeroComplejo(0, 4);
        esperado[0][1] = new NumeroComplejo(0, 4);
        esperado[1][0] = new NumeroComplejo(0, 4);
        esperado[1][1] = new NumeroComplejo(0, 4);
        NumeroComplejo nc = new NumeroComplejo(2, 2);
        NumeroComplejo[][] respuesta = operador.multiplicacionEscalarMatriz(lista, nc);
        assertEquals(respuesta, esperado);
    }

    @Test
    public void MatrizTranspuesta() {

        NumeroComplejo[][] lista = new NumeroComplejo[2][2];
        NumeroComplejo[][] esperado = new NumeroComplejo[2][2];
        lista[0][0] = new NumeroComplejo(1, 0);
        lista[0][1] = new NumeroComplejo(1, 0);
        lista[1][0] = new NumeroComplejo(0, 1);
        lista[1][1] = new NumeroComplejo(1, 0);
        esperado[0][0] = new NumeroComplejo(1, 0);
        esperado[0][1] = new NumeroComplejo(0, 1);
        esperado[1][0] = new NumeroComplejo(1, 0);
        esperado[1][1] = new NumeroComplejo(1, 0);
        NumeroComplejo[][] respuesta = operador.TranspuestaMatriz(lista);
        assertEquals(respuesta, esperado);
    }

    @Test
    public void MatrizConjugada() {

        NumeroComplejo[][] lista = new NumeroComplejo[2][2];
        NumeroComplejo[][] esperado = new NumeroComplejo[2][2];
        lista[0][0] = new NumeroComplejo(1, 1);
        lista[0][1] = new NumeroComplejo(1, 1);
        lista[1][0] = new NumeroComplejo(1, 1);
        lista[1][1] = new NumeroComplejo(1, 1);
        esperado[0][0] = new NumeroComplejo(1, -1);
        esperado[0][1] = new NumeroComplejo(1, -1);
        esperado[1][0] = new NumeroComplejo(1, -1);
        esperado[1][1] = new NumeroComplejo(1, -1);
        NumeroComplejo[][] respuesta = operador.MatrizConjugada(lista);
        assertEquals(respuesta, esperado);
    }

    @Test
    public void MatrizAdjunta() {

        NumeroComplejo[][] lista = new NumeroComplejo[2][2];
        NumeroComplejo[][] esperado = new NumeroComplejo[2][2];
        lista[0][0] = new NumeroComplejo(1, 0);
        lista[0][1] = new NumeroComplejo(1, 0);
        lista[1][0] = new NumeroComplejo(0, 1);
        lista[1][1] = new NumeroComplejo(1, 0);
        esperado[0][0] = new NumeroComplejo(1, 0);
        esperado[0][1] = new NumeroComplejo(0, -1);
        esperado[1][0] = new NumeroComplejo(1, 0);
        esperado[1][1] = new NumeroComplejo(1, 0);
        NumeroComplejo[][] respuesta = operador.MatrizAdjunta(lista);
        assertEquals(respuesta, esperado);
    }

    @Test
    public void NormaMatriz() throws Exception {
        NumeroComplejo[][] lista = new NumeroComplejo[2][2];
        lista[0][0] = new NumeroComplejo(3, 0);
        lista[0][1] = new NumeroComplejo(5, 0);
        lista[1][0] = new NumeroComplejo(2, 0);
        lista[1][1] = new NumeroComplejo(3, 0);
        double esperado = Math.sqrt(47);
        double respuesta = operador.NormaMatriz(lista);
        assertEquals(respuesta, respuesta, 0.7);
    }

    @Test
    public void DistanciaMatriz() {
        double DELTA = 1e-15;
        double[][] lista = new double[2][2];
        double[][] listaDos = new double[2][2];
        lista[0][0] = 3;
        lista[0][1] = 5;
        lista[1][0] = 2;
        lista[1][1] = 3;
        listaDos[0][0] = 1;
        listaDos[0][1] = 6;
        listaDos[1][0] = 2;
        listaDos[1][1] = 4;
        double esperado = 2.449489742783178;
        double respuesta = operador.DistacnciaMatrizes(lista, listaDos);
        assertEquals(respuesta, esperado, DELTA);
    }

    @Test
    public void MatrizUnitaria() throws Exception {

        NumeroComplejo[][] lista = new NumeroComplejo[2][2];
        lista[0][0] = new NumeroComplejo(3, 2);
        lista[0][1] = new NumeroComplejo(9, 5);
        lista[1][0] = new NumeroComplejo(5, -6);
        lista[1][1] = new NumeroComplejo(1, 4);
        boolean esperado = false;
        boolean respuesta = operador.EsMatrizUnitaria(lista);
        assertEquals(respuesta, esperado);
    }

    @Test
    public void MatrizHermitiana() throws Exception {

        NumeroComplejo[][] lista = new NumeroComplejo[2][2];
        lista[0][0] = new NumeroComplejo(1, 8);
        lista[0][1] = new NumeroComplejo(8, 1);
        lista[1][0] = new NumeroComplejo(6, -6);
        lista[1][1] = new NumeroComplejo(-6, 6);
        boolean esperado = false;
        boolean respuesta = operador.esHermitianMatriz(lista);
        assertEquals(respuesta, esperado);
    }

    @Test
    public void TensorMatriz() {

        NumeroComplejo[][] lista = new NumeroComplejo[2][2];
        NumeroComplejo[][] listaDos = new NumeroComplejo[2][2];
        NumeroComplejo[][] esperado = new NumeroComplejo[4][4];
        lista[0][0] = new NumeroComplejo(1, 0);
        lista[0][1] = new NumeroComplejo(0, 0);
        lista[1][0] = new NumeroComplejo(2, 0);
        lista[1][1] = new NumeroComplejo(3, 0);
        listaDos[0][0] = new NumeroComplejo(1, 0);
        listaDos[0][1] = new NumeroComplejo(1, 0);
        listaDos[1][0] = new NumeroComplejo(1, 0);
        listaDos[1][1] = new NumeroComplejo(1, 0);
        esperado[0][0] = new NumeroComplejo(1, 0);
        esperado[0][1] = new NumeroComplejo(1, 0);
        esperado[0][2] = new NumeroComplejo(0, 0);
        esperado[0][3] = new NumeroComplejo(0, 0);
        esperado[1][0] = new NumeroComplejo(1, 0);
        esperado[1][1] = new NumeroComplejo(1, 0);
        esperado[1][2] = new NumeroComplejo(0, 0);
        esperado[1][3] = new NumeroComplejo(0, 0);
        esperado[2][0] = new NumeroComplejo(2, 0);
        esperado[2][1] = new NumeroComplejo(2, 0);
        esperado[2][2] = new NumeroComplejo(3, 0);
        esperado[2][3] = new NumeroComplejo(3, 0);
        esperado[3][0] = new NumeroComplejo(2, 0);
        esperado[3][1] = new NumeroComplejo(2, 0);
        esperado[3][2] = new NumeroComplejo(3, 0);
        esperado[3][3] = new NumeroComplejo(3, 0);
        NumeroComplejo[][] respuesta = operador.ProductoTensorMatriz(lista, listaDos);
        assertEquals(respuesta, esperado);
    }

    @Test
    public void AccionMatriz() throws Exception {

        NumeroComplejo[][] lista = new NumeroComplejo[3][3];
        NumeroComplejo[] listaDos = new NumeroComplejo[3];
        NumeroComplejo[] esperado = new NumeroComplejo[3];
        lista[0][0] = new NumeroComplejo(3, 2);
        lista[0][1] = new NumeroComplejo(0, 0);
        lista[0][2] = new NumeroComplejo(5, -6);
        lista[1][0] = new NumeroComplejo(1, 0);
        lista[1][1] = new NumeroComplejo(4, 2);
        lista[1][2] = new NumeroComplejo(0, 1);
        lista[2][0] = new NumeroComplejo(4, -1);
        lista[2][1] = new NumeroComplejo(0, 0);
        lista[2][2] = new NumeroComplejo(4, 0);
        listaDos[0] = new NumeroComplejo(7, 8);
        listaDos[1] = new NumeroComplejo(9, 0);
        listaDos[2] = new NumeroComplejo(1, 2);
        esperado[0] = new NumeroComplejo(22, 42);
        esperado[1] = new NumeroComplejo(41, 27);
        esperado[2] = new NumeroComplejo(40, 33);
        NumeroComplejo[] respuesta = operador.accionMatrizSobreVector(lista, listaDos);
        assertEquals(respuesta, esperado);
    }
}
