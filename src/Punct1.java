public class Punct1 {
    static double Yn = 0.95;
    static double Yc = 1.1;
    double Mmax;

    static double degr(double a, int b) {
        for (int i = b; i > 1; i--) {
            a = a * a;
        }
        return a;
    }

    static double Moment(double q, double l) {
        double Mmax = (q * (l * l)) / 8;
        return Mmax;
    }

    static double Qsila(double q, double l) {
        double Qmax = (q * l) / 2;
        return Qmax;
    }

    static double GnormNapr(double Mmax, double c, double W) {
        double Gnorm = Mmax * Yn / (c * W * Yc);
        return Gnorm;
    }

    static double W(double Mmax, double c, double R) {

        double Wn = Mmax * Yn / (R * c * Yc);
        return Wn;
    }

    static double hmin(double R, double l, double q1N, double q2, double f) {
        double Hmin = 5 / 24 * (R * Yc / Yn) *
                (l / (2.06 * degr(10, 5))) * (f / 1) * (q1N / q2);
        return Hmin;
    }

    static double interpolation(double firstVal, double secondVal,
                                double firstCount, double secCount,
                                double myVal) {
        return (firstCount + ((secCount - firstCount) / (secondVal - firstVal)) * (myVal - firstVal));

    }

    public static void main(String[] args) {
        System.out.println(interpolation(6, 24, 200, 250, 13));
    }
}