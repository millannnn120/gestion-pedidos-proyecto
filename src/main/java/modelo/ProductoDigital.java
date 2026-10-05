package modelo;

/**
 * A digital product that is downloaded (no shipping).
 * Its final price is the base price plus 21% VAT minus a 15% discount.
 *
 * @author Javier
 * @version 1.0
 */
public class ProductoDigital extends Producto {
    /** Download size, written as text (for example "250 MB"). */
    private String tamanoDescarga;

    /**
     * Creates a new digital product.
     *
     * @param nombre         name of the product
     * @param precio         base price in euros (cannot be negative)
     * @param tamanoDescarga download size as text, for example "150 MB"
     * @throws IllegalArgumentException if the price is negative
     */
    public ProductoDigital(String nombre, double precio, String tamanoDescarga) {
        super(nombre, precio);
        this.tamanoDescarga = tamanoDescarga;
    }

    /**
     * Gets the download size.
     *
     * @return the download size as text
     */
    public String getTamanoDescarga() {
        return tamanoDescarga;
    }

    /**
     * Changes the download size.
     *
     * @param tamanoDescarga the new download size as text
     */
    public void setTamanoDescarga(String tamanoDescarga) {
        this.tamanoDescarga = tamanoDescarga;
    }

    /**
     * Calculates the final price: base price + 21% VAT, then a 15% discount
     * is applied to that amount.
     *
     * @return the final price in euros
     */
    @Override
    public double calcularPrecioFinal() {
        double precioConIVA = getPrecio() * 1.21;
        double descuento = precioConIVA * 0.15;
        return precioConIVA - descuento;
    }

    /**
     * Returns the product data as text.
     *
     * @return a string with the base data, the download size and the final price
     */
    @Override
    public String toString() {
        return super.toString() + " (Digital) - Tamano: " + tamanoDescarga + " - Total: " + calcularPrecioFinal() + " euros";
    }
}
