package cuantico;

/**
 * Hello world!
 *
 */
public class NumeroComplejo 
{
     double pReal;
    double pImg;

    public NumeroComplejo(double pReal, double pImg) {
        this.pReal = pReal;
        this.pImg = pImg;
    }

    public double getpReal() {
        return pReal;
    }

    public double getpImg() {
        return pImg;
    }

    public double modulo() {
        return Math.sqrt(Math.pow(pReal, 2) + Math.pow(pImg, 2));
    }

    public NumeroComplejo  conjugado() {
        return new NumeroComplejo (pReal, pImg * -1);
    }
    
    public double getFase() {
        return Math.atan2(pImg, pReal);
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof NumeroComplejo)) {
            return false;
        }
        NumeroComplejo c = (NumeroComplejo) o;
        return Double.compare(round(pReal), round(c.getpReal())) == 0 && Double.compare(round(pImg), round(c.getpImg())) == 0;
    }
    
    @Override
    public int hashCode(){
        int hash=3;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.pReal) ^ (Double.doubleToLongBits(this.pReal) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.pImg) ^ (Double.doubleToLongBits(this.pImg) >>> 32));
        return hash;
    }
    
    private double round(double d) {
        String s = Double.toString(d);
        if (s.length() > 7) {
            s = s.substring(0, 7);
        }
        return Double.valueOf(s);
    }

    @Override
    public String toString() {
        return "NumeroComplejo{" + "pReal=" + pReal + ", pImg=" + pImg + '}';
    }
    
}
