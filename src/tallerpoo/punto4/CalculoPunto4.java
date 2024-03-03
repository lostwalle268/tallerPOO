package tallerpoo.punto4;

public class CalculoPunto4 {

    private int[] x;

    public CalculoPunto4() {
    }

    public CalculoPunto4(int n) {
        x = new int[n];
    }

    public double CalcularY(int[] x) {
        double sum1 = 0;
        for (int i = 0; i < x.length; i++) {
            double sum3 = 0;
            double prod2 = 1;
            for (int j = 0; j < x.length; j++) {
                for (int k = 0; k < x.length; k++) {
                    double num = Math.pow(-1, i) * Math.pow(x[i] + x[j] + x[k], i);
                    double factorial = 1;
                    for (int l = 1; l <= i + 1; l++) {
                        factorial *= l;
                    }
                    double den = factorial;
                    double resultado = num / den;
                    sum3 += resultado;
                }
                prod2 *= sum3;
            }
            sum1 += prod2;
        }
        return sum1;
    }

    public static void main(String[] args) {
        CalculoPunto4 y = new CalculoPunto4(10); // Tamaño del arreglo según tus necesidades
        for (int i = 0; i < y.x.length; i++) {
            y.x[i] = (int) (Math.random() * 10);
        }
        double resultado = y.CalcularY(y.x);
        System.out.println("El resultado de Calcular es: " + resultado);
    }
}
