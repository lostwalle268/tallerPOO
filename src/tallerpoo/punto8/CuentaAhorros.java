package tallerpoo.punto8;
public class CuentaAhorros extends Producto {
    private double interesMensual;

    public CuentaAhorros(double saldoInicial, double interesMensual) {
        super(saldoInicial);
        this.interesMensual = interesMensual;
    }

    @Override
    public double calcularInteres(int meses) {
        return saldo * (interesMensual / 100) * meses;
    }
}
