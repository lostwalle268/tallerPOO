package tallerpoo.punto3;

import java.util.Scanner;

public class CalculoPunto3 {

    public int[][] x;

    public CalculoPunto3() {
    }

    public CalculoPunto3(int n) {
        x = new int[n + 1][n + 1];
    }

    public double Calcular(int x[][]) {
        double num, den, res, productoria = 1, sumatoria = 0;
        for (int i = 1; i < x.length; i++) {
            for (int j = 1; j < x.length; j++) {
                x[i][j] = (int) (Math.random() * 10);
                System.out.println(x[i][j] + "( " + i + ", " + j + " )");

            }
        }
        System.out.println("----------------------------------------");
        for (int i = 1; i < x.length; i++) {
            for (int j = 1; j < x.length; j++) {
                num = Math.pow(x[i][j] + x[j][i], i + j);
                den = Math.pow(i, 2) + Math.pow(j, 3);
                res = num / den;
                productoria *= res;
            }
            sumatoria += productoria;
        }
        return sumatoria;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese N2");
        CalculoPunto3 y = new CalculoPunto3(read.nextInt());
        double resultado = y.Calcular(y.x);
        System.out.println("El resultado de Calcular es: " + resultado);
    }
}
