package tallerpoo.punto1;

import java.util.Scanner;

public class Dueño {
public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        CuentaDeAhorro cuenta = new CuentaDeAhorro();
        boolean opcion = true;
        System.out.println("Hola usuario!");
        System.out.println("Por favor, establezcan su saldo");
        cuenta.setSaldo();
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
                    cuenta.depositar();
                    break;
                case 2:
                    cuenta.retirar();
                    break;
                case 3:
                    System.out.println("Su saldo es: " + cuenta.consultar());
                    break;
            }
        }
    }    
}
