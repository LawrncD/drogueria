package co.edu.uniquindio.poo;

public class CuidadoPersonal extends Producto {
    private final String ingredientes;

    /*
     * Método constructor de la clase CuidadoPersonal
     */
    public CuidadoPersonal (String ingredientes, String idProducto, String nombre, String descripcion, int precio, int cantidadStock, String idProveedor){
        super(idProducto, nombre, descripcion, precio, cantidadStock, idProveedor);
        this.ingredientes = ingredientes;
    }

    /*
     * Método para obtener los ingredientes del producto de CuidadoPersonal
     */
    public String getIngredientes (){
        return ingredientes;
    }

    /*
     * Método toString de la clase CuidadoPersonal
     */
    @Override
    public String toString() {
        return "CuidadoPersonal [ingredientes=" + ingredientes + "]";
    }

}
