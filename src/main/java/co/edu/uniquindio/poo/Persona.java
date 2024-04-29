package co.edu.uniquindio.poo;


public abstract class Persona {
    private final String nombres;
    private final String apellidos;
    private final String dni;
    private final String direccion;
    private final String telefono;
    
    /*
     * Método constructor de la clase Persona
     */
    public Persona (String nombres, String apellidos, String dni, String direccion, String telefono){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    /*
     * Método para obtener el nombre
     */
    public String getNombres() {
        return nombres;
    }

    /*
     * Método para obtener los apellidos de una persona
     */
    public String getApellidos() {
        return apellidos;
    }

    /*
     * Método para obtener el DNI de una persona
     */
    public String getDni() {
        return dni;
    }

    /*
     * Método para obtener la dirección de una persona
     */
    public String getDireccion() {
        return direccion;
    }

    /*
     * Método para obtener el telefono de una persona
     */
    public String getTelefono() {
        return telefono;
    }

    /*
     * Método toString
     */
    @Override
    public String toString() {
        return "Persona [nombres=" + nombres + ", apellidos=" + apellidos + ", dni=" + dni + ", direccion=" + direccion
                + ", telefono=" + telefono + "]";
    }


}
