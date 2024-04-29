package co.edu.uniquindio.poo;

import java.util.Collection;

public class Gerente extends Empleado{
    private Collection<Producto> listaProductos;
    
    /*
     * Método constructor de la clase Gerente
     */
    public Gerente (String idEmpleado, double salario, String nombres, String apellidos, String dni, String direccion, String telefono){
        super(idEmpleado, salario, nombres, apellidos, dni, direccion, telefono);
    }
    
    /*
     * Método para agregar un producto
     */
    public void agregarProducto (Producto producto){
        listaProductos.add(producto);
    }

    /*
     * Método para eliminar un producto
     */
    public void eliminarProducto (Producto producto){
        listaProductos.remove(producto);
    }
}
