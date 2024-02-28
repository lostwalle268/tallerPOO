package tallerpoo;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int opcion;
        System.out.println("Que punto desea ver?");
        System.out.println("1. Punto 1");
        System.out.println("2. Punto 2");
        System.out.println("3. Punto 3");
        System.out.println("4. Punto 4");
        System.out.println("5. Punto 5");
        System.out.println("6. Punto 6");
        System.out.println("7. Punto 7");
        System.out.println("8. Punto 8");
        System.out.println("0. Salir");
        boolean iteracion = true;
        while (iteracion) {
            opcion = read.nextInt();
            switch (opcion) {
                case 0:
                    iteracion = false;
                    break;
                case 1:
                    System.out.println("Hola");
                    break;
            }
        }
    }
}
