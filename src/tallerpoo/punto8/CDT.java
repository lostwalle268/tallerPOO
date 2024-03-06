package tallerpoo.punto8;
public class CDT extends Producto {
    private double inversion;
    private double interesAnual;
    private int plazoMeses;

    public CDT(double inversion, double interesAnual, int plazoMeses) {
        super(inversion);
        this.inversion = inversion;
        this.interesAnual = interesAnual;
        this.plazoMeses = plazoMeses;
    }

    @Override
    public double calcularInteres(int meses) {
        // Fórmula para calcular interés compuesto: A = P(1 + r/n)^(nt)
        double tasaMensual = interesAnual / 12 / 100; // Tasa de interés mensual
        double saldoFinal = inversion * Math.pow(1 + tasaMensual, plazoMeses);
        return saldoFinal - inversion;
    }
}
