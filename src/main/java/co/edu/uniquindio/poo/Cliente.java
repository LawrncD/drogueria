package co.edu.uniquindio.poo;

public class Cliente extends Persona{
    
    /*
     * Método constructor de la clase Cliente
     */
    public Cliente (String nombres, String apellidos, String dni, String direccion, String telefono){
        super(nombres, apellidos, dni, direccion, telefono);
    }

    /*
     * Método toString de la clase Cliente
     */
    @Override
    public String toString() {
        return "Cliente []";
    }
}