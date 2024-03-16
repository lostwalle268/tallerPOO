package tallerpoo.punto4;
import java.util.Scanner;
public class CalculoPunto4 {
    public int[] x;
    public CalculoPunto4() {
    }
    public CalculoPunto4(int n) {
        x = new int[n+1];
    }
    public double CalcularY(int[] x) {
        for (int i = 1; i < x.length; i++) {
            x[i] = (int) (Math.random() * 10);
            System.out.println(x[i]+" "+i);
        }
        System.out.println("----------------------------");
        double sum1 = 0;
        for (int i = 1; i < x.length; i++) {
            double sum2 = 0;
            double prod2 = 1;
            for (int j = 1; j < x.length; j++) {
                for (int k = 1; k < x.length; k++) {
                    double num = Math.pow(-1, i) * Math.pow(x[i] + x[j] + x[k], i);
                    double factorial = 1;
                    for (int l = 1; l <= i + 1; l++) {
                        factorial *= l;
                    }
                    double den = factorial;
                    double resultado = num / den;
                    sum2 += resultado;
                }
                prod2 *= sum2;
            }
            sum1 += prod2;
        }
        return sum1;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese N");
        CalculoPunto4 y = new CalculoPunto4(read.nextInt()); // Tamaño del arreglo según tus necesidades
        double resultado = y.CalcularY(y.x);
        System.out.println("El resultado de Calcular es: " + resultado);
    }
}
