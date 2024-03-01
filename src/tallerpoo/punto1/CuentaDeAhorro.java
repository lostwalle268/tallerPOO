package tallerpoo.punto1;

import java.util.Scanner;

public class CuentaDeAhorro {

    Scanner read = new Scanner(System.in);
    private long dineroRetirado;
    private long dineroDepositado;
    private long saldo;
    public void setSaldo() {
        this.saldo = read.nextLong();
    }
    
    public void depositar() {
        System.out.println("Cuanto dinero quiere depositar?");
        dineroDepositado = read.nextInt();
        saldo=saldo+dineroDepositado;
        System.out.println("Su dinero depositado ha sido agregado a su cuenta!");
        System.out.println("Nuevo saldo: " + saldo);
    }

    public void retirar() {
        System.out.println("Cuanto dinero desea retirar?");
        dineroRetirado = read.nextInt();
        saldo=saldo-dineroRetirado;
        System.out.println("Su dinero depositado ha sido retirado de su cuenta!");
        System.out.println("Nuevo saldo: " + saldo);
    }

    public long consultar() {
        return saldo;
    }

}
