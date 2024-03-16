package tallerpoo.punto8;

import java.util.Scanner;

public class CDT extends Producto {
    Scanner read = new Scanner(System.in);
    private double inversion;
    private double interesAnual;
    private int plazoMeses;

    public CDT(double inversion, double interesAnual, int plazoMeses) {
        super(inversion);
        this.inversion = inversion;
        this.interesAnual = interesAnual;
        this.plazoMeses = plazoMeses;
    }

    public int getPlazoMeses() {
        return plazoMeses;
    }

    public void setPlazoMeses(int plazoMeses) {
        System.out.println("Ingrese el plazo a meses");
        this.plazoMeses = read.nextInt();
    }
    

    @Override
    public double calcularInteres(int meses) {
        // Fórmula para calcular interés compuesto: A = P(1 + r/n)^(nt)
        double tasaMensual = interesAnual / 12 / 100; // Tasa de interés mensual
        double saldoFinal = inversion * Math.pow(1 + tasaMensual, plazoMeses);
        return saldoFinal - inversion;
    }
}
