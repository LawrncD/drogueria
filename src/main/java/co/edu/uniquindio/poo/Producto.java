package co.edu.uniquindio.poo;

public abstract class Producto {
    private final String idProducto;
    private final String nombre;
    private final String descripcion;
    private final int precio;
    private final int cantidadStock;
    private final String idProveedor;

    /*
     * Método constructor de la clase Producto
     */
    public Producto (String idProducto, String nombre, String descripcion, int precio, int cantidadStock, String idProveedor){
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
        this.idProveedor = idProveedor;
        assert cantidadStock > 0;
    }

    /*
     * Método para obtener el id de un producto
     */
    public String getIdProducto() {
        return idProducto;
    }

    /*
     * Método para obtener el nombre de un producto
     */
    public String getNombre() {
        return nombre;
    }

    /*
     * Método para obtener la descripcion de un producto
     */
    public String getDescripcion() {
        return descripcion;
    }

    /*
     * Método para obtener el precio de un producto
     */
    public int getPrecio() {
        return precio;
    }

    /*
     * Método para obtener la cantidad de stock de un producto
     */
    public int getCantidadStock() {
        return cantidadStock;
    }

    /*
     * Método para obtener el id de un proveedor
     */
    public String getIdProveedor() {
        return idProveedor;
    }

    /*
     * Método toString
     */
    @Override
    public String toString() {
        return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", descripcion=" + descripcion
                + ", precio=" + precio + ", cantidadStock=" + cantidadStock + ", idProveedor=" + idProveedor + "]";
    }
}