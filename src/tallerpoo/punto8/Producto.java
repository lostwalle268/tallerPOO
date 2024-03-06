package tallerpoo.punto8;
public abstract class Producto {
    protected double saldo;

    public Producto(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract double calcularInteres(int meses);

    public void actualizarSaldo(double interes) {
        saldo += interes;
    }
}




