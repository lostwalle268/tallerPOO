package tallerpoo.punto8;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nombre;
    private List<Producto> productos;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double getSaldoTotal() {
        int saldoTotal = 0;
        for (Producto producto : productos) {
            saldoTotal += producto.getSaldo();
        }
        return saldoTotal;
    }

    public void simularProductos(int meses) {
        for (Producto producto : productos) {
            double interes = producto.calcularInteres(meses);
            System.out.println(producto.getClass().getSimpleName() + ": Saldo antes de intereses: " + producto.getSaldo());
            System.out.println("Intereses generados: " + interes);
            producto.actualizarSaldo(interes);
            System.out.println(producto.getClass().getSimpleName() + ": Saldo después de intereses: " + producto.getSaldo());
        }
    }

    public String escribir(int meses) {
        String resultado="";
        String resultado2="";
        String res;
        for (Producto producto : productos) {
            double interes = producto.calcularInteres(meses);
            resultado = (String.valueOf(producto.getSaldo()) + "" + String.valueOf(interes));
            producto.actualizarSaldo(interes);
            resultado2 = String.valueOf(producto.getSaldo());
        }
        res= resultado+resultado2;
        return res;
    }
}
