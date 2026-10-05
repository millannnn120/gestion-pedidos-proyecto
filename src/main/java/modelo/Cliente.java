package modelo;

/**
 * Represents a customer who can place orders.
 * It stores the customer's name, email and postal address.
 *
 * @author Javier
 * @version 1.0
 */
public class Cliente {
    /** Full name of the customer. */
    private String nombre;
    /** Email address of the customer. */
    private String correo;
    /** Postal address of the customer. */
    private String direccion;

    /**
     * Creates a new customer.
     *
     * @param nombre    full name of the customer
     * @param correo    email address of the customer
     * @param direccion postal address of the customer
     */
    public Cliente(String nombre, String correo, String direccion) {
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
    }

    /**
     * Gets the name of the customer.
     *
     * @return the customer's name
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Changes the name of the customer.
     *
     * @param nombre the new name
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets the email of the customer.
     *
     * @return the customer's email
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Changes the email of the customer.
     *
     * @param correo the new email
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Gets the postal address of the customer.
     *
     * @return the customer's address
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Changes the postal address of the customer.
     *
     * @param direccion the new address
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Returns the customer data as text.
     *
     * @return a string with the name, email and address, one per line
     */
    @Override
    public String toString() {
        return "Cliente: " + nombre + "\nCorreo: " + correo + "\nDireccion: " + direccion;
    }
}
