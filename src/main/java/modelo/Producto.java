package modelo;

/**
 * Abstract base class for every product that can be sold.
 * Each subclass decides how its final price is calculated.
 *
 * @author Javier
 * @version 1.0
 * @see ProductoFisico
 * @see ProductoDigital
 */
public abstract class Producto {
    /** Name of the product. */
    private String nombre;
    /** Base price of the product, in euros, without taxes. */
    private double precio;

    /**
     * Creates a new product.
     *
     * @param nombre name of the product
     * @param precio base price in euros (cannot be negative)
     * @throws IllegalArgumentException if the price is negative
     */
    public Producto(String nombre, double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Gets the name of the product.
     *
     * @return the product's name
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Changes the name of the product.
     *
     * @param nombre the new name
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets the base price of the product.
     *
     * @return the base price in euros
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Changes the base price of the product.
     *
     * @param precio the new base price in euros
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Calculates the final price of the product (taxes, discounts, shipping...).
     * Every subclass must implement its own rule.
     *
     * @return the final price in euros
     */
    public abstract double calcularPrecioFinal();

    /**
     * Returns the product data as text.
     *
     * @return a string with the product name and its base price
     */
    @Override
    public String toString() {
        return nombre + " - Precio base: " + precio + " euros";
    }
}
