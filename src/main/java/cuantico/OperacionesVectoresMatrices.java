/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuantico;

/**
 *
 * @author andy
 */
public class OperacionesVectoresMatrices {
    Calculadora cal;

    public OperacionesVectoresMatrices() {
        cal = new Calculadora();
    }
     public NumeroComplejo[] adicionVectorial(NumeroComplejo[] v1, NumeroComplejo[] v2) {
        NumeroComplejo[] vector = new NumeroComplejo[v2.length];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = cal.suma(v1[i], v2[i]);
        }
        return vector;
    }
      public NumeroComplejo[] inversoAditivo(NumeroComplejo[] v1) {
        NumeroComplejo[] vector = new NumeroComplejo[v1.length];
        for (int i = 0; i < vector.length; i++) {

            vector[i] = new NumeroComplejo(-v1[i].getpReal(), - v1[i].getpImg());

        }
        return vector;
    }
      public NumeroComplejo[] multiplicacionEscalarVectorial(NumeroComplejo[] v1, NumeroComplejo nc) {
        NumeroComplejo[] vector = new NumeroComplejo[v1.length];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = cal.producto(v1[i], nc);

        }
        return vector;
    }
    public NumeroComplejo[][] adicionMatriz(NumeroComplejo[][] m1, NumeroComplejo[][] m2) {
        NumeroComplejo[][] matriz = new NumeroComplejo[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                matriz[i][j] = cal.suma(m1[i][j], m2[i][j]);
            }

        }
        return matriz;
    }
     public NumeroComplejo[][] inversaMatriz(NumeroComplejo[][] m1) {
        NumeroComplejo[][] matriz = new NumeroComplejo[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                matriz[i][j] = new NumeroComplejo(-m1[i][j].getpReal(), -m1[i][j].getpImg());
            }
        }

        return matriz;
    }
     public NumeroComplejo[][] multiplicacionEscalarMatriz(NumeroComplejo[][] m1, NumeroComplejo c1) {
        NumeroComplejo[][] matriz = new NumeroComplejo[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                matriz[i][j] = cal.producto(m1[i][j], c1);
            }
        }
        return matriz;
    }
     public NumeroComplejo[][] TranspuestaMatriz(NumeroComplejo[][] m1) {
        NumeroComplejo[][] matriz = new NumeroComplejo[m1.length][m1[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[j][i] = m1[i][j];
            }

        }
        return matriz;
    }
    public NumeroComplejo[][] MatrizConjugada(NumeroComplejo[][] m1) {
        NumeroComplejo[][] matriz = new NumeroComplejo[m1.length][m1[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = cal.conjugado(m1[i][j]);
            }
        }
        return matriz;
    }
     public NumeroComplejo[][] MatrizAdjunta(NumeroComplejo[][] m1) {
        NumeroComplejo[][] matriz;
        matriz = this.TranspuestaMatriz(m1);
        matriz = this.MatrizConjugada(matriz);
        return matriz;
    }
     public NumeroComplejo[][] matrizProducto(NumeroComplejo[][] m1, NumeroComplejo[][] m2) throws Exception {
        if (m1.length != m2[0].length) {
            throw new Exception("The matrices are not square");
        } else {
            NumeroComplejo[][] r = new NumeroComplejo[m1.length][m1[0].length];
            NumeroComplejo s = new NumeroComplejo(0, 0);
            for (int m = 0; m < m1.length; m++) {
                for (int n = 0; n < m1[0].length; n++) {
                    for (int i = 0; i < m1.length; i++) {
                        NumeroComplejo temp = cal.producto(m1[m][i], m2[i][n]);
                        s = cal.suma(s, temp);
                    }
                    r[m][n] = s;
                    s = new NumeroComplejo(0, 0);
                }
            }
            return r;
        }
    }
     public  NumeroComplejo[] accionMatrizSobreVector(NumeroComplejo[][] m1,NumeroComplejo[] v) throws Exception{
        if (m1[0].length != v.length) {
            throw new Exception("la longitud de las filas de la matriz es diferente a la longitud el vector");
	} else {
            NumeroComplejo[] r = new NumeroComplejo[v.length];  
            NumeroComplejo s = new NumeroComplejo(0,0);
            for (int i = 0; i < v.length; i++) {
                for (int j = 0; j < m1[0].length; j++) {
                    s = cal.suma(s, cal.producto(m1[i][j], v[j]));
		}
		r[i] = s;
		s = new NumeroComplejo(0,0);
            }
            return r;
	}
    }
    public NumeroComplejo ProductoInternoVector(NumeroComplejo[] v1, NumeroComplejo[] v2) throws Exception {
        if (v1.length != v2.length) {
            throw new Exception("The length of the 2 vectors is different");
        } else {
            NumeroComplejo r = new NumeroComplejo(0, 0);
            for (int i = 0; i < v1.length; i++) {
                r = cal.suma(r, cal.producto(cal.conjugado(v1[i]), v2[i]));
            }
            return r;
        }
    }
    public double NormaMatriz(NumeroComplejo[][] m1) throws Exception {
        if (m1.length != m1[0].length) {
            throw new Exception("The matrix is not square");
        } else {
            NumeroComplejo[][] mt = new NumeroComplejo[m1.length][m1[0].length];
            for (int i = 0; i < mt.length; i++) {
                for (int j = 0; j < mt.length; j++) {
                    mt[i][j] = m1[j][i];
                }
            }
            NumeroComplejo[][] r = new NumeroComplejo[m1.length][m1[0].length];
            double s = 0;
            NumeroComplejo temp = new NumeroComplejo(s, 0);
            for (int i = 0; i < mt.length; i++) {
                for (int j = 0; j < mt[0].length; j++) {
                    for (int k = 0; k < mt.length; k++) {
                        temp = new NumeroComplejo(s, 0);
                        temp = cal.suma(temp, (cal.producto(mt[i][k], m1[i][j])));
                    }
                    r[i][j] = temp;
                    s = 0;
                }
            }
            NumeroComplejo trace = new NumeroComplejo(0, 0);
            for (int i = 0; i < r.length; i++) {
                trace = cal.suma(trace, r[i][i]);
            }
            return Math.sqrt(trace.getpReal());
        }
    }
     public double DistacnciaMatrizes(double[][] m1, double[][] m2) {

        double ms[][] = new double[m1.length][m1[0].length];
        for (int i = 0; i < ms.length; i++) {
            for (int j = 0; j < ms[0].length; j++) {
                ms[i][j] = m1[i][j] - m2[i][j];
            }
        }
        double[][] mt = new double[ms.length][ms[0].length];
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt.length; j++) {
                mt[i][j] = ms[j][i];
            }
        }
        double[][] r = new double[mt.length][mt[0].length];
        double s = 0;
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt[0].length; j++) {
                for (int k = 0; k < mt.length; k++) {
                    s = s + (mt[i][k] * ms[i][j]);
                }
                r[i][j] = s;
                s = 0;
            }
        }
        double trace = 0;
        for (int i = 0; i < r.length; i++) {
            trace = trace + r[i][i];
        }
        return Math.sqrt(trace);

    }
    public boolean EsMatrizUnitaria(NumeroComplejo[][] m1) throws Exception {
        if (m1.length != m1[0].length) {
            throw new Exception("The matrix is not square");
        } else {
            boolean flag;
            flag = this.matrizProducto(m1, this.MatrizAdjunta(m1)).equals(this.matrizProducto(this.MatrizAdjunta(m1), m1));
            return flag;
        }
    }
     public boolean esHermitianMatriz(NumeroComplejo[][] m1) throws Exception {
        if (m1.length != m1[0].length) {
            throw new Exception("The matriz is not square");
        } else {
            return m1.equals(MatrizAdjunta(m1));
        }
    }
    public NumeroComplejo[][] ProductoTensorMatriz(NumeroComplejo[][] m1, NumeroComplejo[][] m2) {
        NumeroComplejo[][] r = new NumeroComplejo[m1.length * m2.length][m1[0].length * m2[0].length];
        NumeroComplejo[][] sp;
        int m = 0;
        int n = 0;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                sp = this.multiplicacionEscalarMatriz(m2, m1[i][j]);
                for (int k = 0; k < sp.length; k++) {
                    for (int l = 0; l < sp[0].length; l++) {
                        r[m][n] = sp[k][l];
                        n++;
                    }
                    m++;
                    n = j * m2[0].length;
                }
                m = i * m2.length;
                n = (j + 1) * m2[0].length;
            }
            m = (i + 1) * m2.length;
            n = 0;
        }
        return r;
    }
}
