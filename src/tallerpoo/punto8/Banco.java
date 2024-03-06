package tallerpoo.punto8;
import java.util.ArrayList;
import java.util.List;

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
        Banco banco = new Banco();

        // Agregar clientes y productos (cuentas, CDT, etc.)
         Cliente cliente1 = new Cliente("NombreCliente1");
         banco.agregarCliente(cliente1);
         cliente1.agregarProducto(new CuentaAhorros(1000, 0.6)); // Ejemplo de agregar cuenta de ahorros con saldo inicial de 1000 y 0.6% de interés mensual
         cliente1.agregarProducto(new CDT(5000, 0.05, 12)); // Ejemplo de agregar CDT con inversión de 5000, 5% de interés anual y plazo de 12 meses

        // Simular productos para cierta cantidad de meses
         banco.simularProductos(6); // Simular por 6 meses
    }
}
