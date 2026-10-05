package modelo;

/**
 * A physical product that has to be shipped to the customer.
 * Its final price is the base price plus 21% VAT plus the shipping cost.
 *
 * @author Javier
 * @version 1.0
 */
public class ProductoFisico extends Producto {
    /** Shipping cost in euros. */
    private double costeEnvio;

    /**
     * Creates a new physical product.
     *
     * @param nombre     name of the product
     * @param precio     base price in euros (cannot be negative)
     * @param costeEnvio shipping cost in euros
     * @throws IllegalArgumentException if the price is negative
     */
    public ProductoFisico(String nombre, double precio, double costeEnvio) {
        super(nombre, precio);
        this.costeEnvio = costeEnvio;
    }

    /**
     * Gets the shipping cost.
     *
     * @return the shipping cost in euros
     */
    public double getCosteEnvio() {
        return costeEnvio;
    }

    /**
     * Changes the shipping cost.
     *
     * @param costeEnvio the new shipping cost in euros
     */
    public void setCosteEnvio(double costeEnvio) {
        this.costeEnvio = costeEnvio;
    }

    /**
     * Calculates the final price: base price + 21% VAT + shipping cost.
     *
     * @return the final price in euros
     */
    @Override
    public double calcularPrecioFinal() {
        double precioConIVA = getPrecio() * 1.21;
        return precioConIVA + costeEnvio;
    }

    /**
     * Returns the product data as text.
     *
     * @return a string with the base data, the shipping cost and the final price
     */
    @Override
    public String toString() {
        return super.toString() + " (Fisico) - Envio: " + costeEnvio + " euros - Total: " + calcularPrecioFinal() + " euros";
    }
}
