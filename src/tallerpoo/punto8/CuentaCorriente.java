package tallerpoo.punto8;
public class CuentaCorriente extends Producto {
    public CuentaCorriente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public double calcularInteres(int meses) {
        return 0; // La cuenta corriente no genera intereses
    }
}