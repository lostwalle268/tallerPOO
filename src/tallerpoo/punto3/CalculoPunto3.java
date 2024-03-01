package tallerpoo.punto3;

public class CalculoPunto3 {

    private int[][] x;

    public CalculoPunto3() {
    }

    public CalculoPunto3(int n) {
        x = new int[n][n];
    }

    public double Calcular(int x[][]) {
        double num, den, res, productoria = 1, sumatoria = 0;
        for (int i = 1; i < x.length; i++) {
            for (int j = 1; j < x.length; j++) {
                num = x[i][j] + x[j][i];
                num = Math.pow(num, i + j);
                den = Math.pow(i, 2) + Math.pow(j, 3);
                res = num / den;
                productoria = productoria * res;
            }
            sumatoria = sumatoria + productoria;
        }
        return sumatoria;
    }

    public static void main(String[] args) {
        CalculoPunto3 y = new CalculoPunto3(2);
        for (int i = 0; i < y.x.length; i++) {
            for (int j = 0; j < y.x.length; j++) {
                y.x[i][j] = (int) (Math.random() * 10); // Asignar valores aleatorios entre 0 y 9
            }
        }
        double resultado = y.Calcular(y.x);
        System.out.println("El resultado de Calcular es: " + resultado);
        
    }
}
