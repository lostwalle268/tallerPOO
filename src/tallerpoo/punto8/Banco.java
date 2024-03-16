package tallerpoo.punto8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
    
    private List<Cliente> clientes;

    public Banco() {
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void simularProductos(int meses) {
        for (Cliente cliente : clientes) {
            System.out.println("Cliente: " + cliente.getNombre());
            cliente.simularProductos(meses);
            System.out.println("Saldo total: " + cliente.getSaldoTotal());
            System.out.println("-----------------------");
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Banco banco = new Banco();
        System.out.println("Cual es su nombre?");
        Cliente cliente1 = new Cliente(read.next());
        System.out.println("Hola " + cliente1.getNombre());
        banco.agregarCliente(cliente1);
        System.out.println("Cual es su saldo en su cuenta de ahorros?");
        cliente1.agregarProducto(new CuentaAhorros(read.nextInt(), 0.6));
        System.out.println("Cuanto desea saldo desea simular en su CDT");   
        cliente1.agregarProducto(new CDT(read.nextDouble(), 0.05, 12)); 
        banco.simularProductos(6);
        String hola;
       
    }
}
