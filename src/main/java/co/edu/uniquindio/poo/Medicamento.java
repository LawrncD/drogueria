package co.edu.uniquindio.poo;

public class Medicamento extends Producto {
    private final double dosis;

    /*
     * Método constructor de la clase Medicamento
     */
    public Medicamento(double dosis, String idProducto, String nombre, String descripcion, int precio, int cantidadStock, String idProveedor){
        super(idProducto, nombre, descripcion, precio, cantidadStock, idProveedor);
        this.dosis = dosis;
    }

    /*
     * Método para obtener la dosis de un medicamento
     */
    public double getDosis (){
        return dosis;
    }

    /*
     * Método toString
     */
    @Override
    public String toString() {
        return "Medicamento [dosis=" + dosis + "]";
    }
}