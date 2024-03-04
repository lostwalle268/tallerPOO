package tallerpoo.punto1;

import java.util.Scanner;

public class CuentaDeAhorro {

    Scanner read = new Scanner(System.in);
    long dineroRetirado;
    long dineroDepositado;
    private long saldo;
    
    public void establecer(long saldo) {
        this.saldo = saldo;
    }
    
    public void depositar() {
        dineroDepositado = read.nextInt();
        saldo=saldo+dineroDepositado;
    }

    public void retirar() {
        dineroRetirado = read.nextInt();
        saldo=saldo-dineroRetirado;
    }

    public long consultar() {
        return saldo;
    }
}
