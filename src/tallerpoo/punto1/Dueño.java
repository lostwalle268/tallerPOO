package tallerpoo.punto1;
import java.util.Scanner;
public class Dueño {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        CuentaDeAhorro cuenta = new CuentaDeAhorro();
        boolean opcion = true;
        System.out.println("Hola usuario!");
        System.out.println("Por favor, establezcan su saldo");
        cuenta.establecer(read.nextLong());
        while (opcion) {
            System.out.println("Que desea hacer?");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar");
            System.out.println("0. Salir");

            int opcionmenu;
            opcionmenu = read.nextInt();
            switch (opcionmenu) {
                case 0:
                    opcion = false;
                    break;
                case 1:
                    System.out.println("Cuanto dinero quiere depositar?");
                    cuenta.depositar();
                    System.out.println("Su dinero depositado ha sido agregado a su cuenta!");
                    break;
                case 2:
                    System.out.println("Cuanto dinero desea retirar?");
                    cuenta.retirar();
                    System.out.println("Su dinero depositado ha sido retirado de su cuenta!");
                    break;
                case 3:
                    System.out.println("Su saldo es: " + cuenta.consultar());
                    break;
            }
        }
    }
}
