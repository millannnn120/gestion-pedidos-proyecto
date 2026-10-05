package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * An order made by a customer. It contains a list of products and gets
 * an automatic order number when it is created.
 *
 * @author Javier
 * @version 1.0
 */
public class Pedido {
    /** Customer who makes the order. */
    private Cliente cliente;
    /** Products included in the order. */
    private List<Producto> productos;
    /** Unique number of this order. */
    private int numeroPedido;
    /** Counter used to give a new number to each order. */
    private static int contadorPedidos = 1;

    /**
     * Creates an empty order for a customer and assigns the next order number.
     *
     * @param cliente the customer who makes the order
     */
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.numeroPedido = contadorPedidos++;
    }

    /**
     * Gets the customer of the order.
     *
     * @return the customer
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Changes the customer of the order.
     *
     * @param cliente the new customer
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Gets the products of the order.
     *
     * @return the list of products
     */
    public List<Producto> getProductos() {
        return productos;
    }

    /**
     * Gets the order number.
     *
     * @return the order number
     */
    public int getNumeroPedido() {
        return numeroPedido;
    }

    /**
     * Adds a product to the order and prints a confirmation message.
     *
     * @param producto the product to add
     */
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    /**
     * Calculates the total of the order by adding the final price of every product.
     *
     * @return the total in euros (0 if the order is empty)
     */
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularPrecioFinal();
        }
        return total;
    }

    /**
     * Prints a summary of the order: number, customer, products and total.
     *
     * @throws IllegalStateException if the order has no products
     */
    public void mostrarResumen() {
        if (productos.isEmpty()) {
            throw new IllegalStateException("El pedido no tiene productos");
        }
        System.out.println("RESUMEN DEL PEDIDO #" + numeroPedido);
        System.out.println(cliente.toString());
        System.out.println("\nProductos:");

        for (Producto producto : productos) {
            System.out.println("- " + producto.toString());
        }

        System.out.println("TOTAL DEL PEDIDO: " + String.format("%.2f", calcularTotal()) + " euros");
    }
}
