package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;


public class Drogueria {
    private final String nombre;
    private final Collection<Persona> listaPersonas;
    private final Collection<Producto> listaProductos;
    private final Collection<Pedido> listaPedidos;

    /*
     * Método construtor de la clase Drogueria
     */
    public Drogueria (String nombre){
        this.nombre =nombre;
        listaPersonas = new LinkedList<>();
        listaProductos = new LinkedList<>();
        listaPedidos = new LinkedList<>();
    }

    /*
     * Método para obtener el nombre de la drogueria
     */
    public String getNombre (){
        return nombre;
    }

    /*
     * Método para obtener la lista no modificable de personas
     */
    public Collection<Persona> getListaPersonas(){
        return Collections.unmodifiableCollection(listaPersonas);
    }

    /*
     * Método para obtener la lista no modificable de Productos
     */
    public Collection<Producto> getListaProductos(){
        return Collections.unmodifiableCollection(listaProductos);
    }
    
    /*
     * Metodo para obtener la coleccion no modificable de pedidos
     */
    public Collection<Pedido> getListarPedidos(){
        return Collections.unmodifiableCollection(listaPedidos);
    }

    /*
     * Método para agregar un pedido a la drogueria
     */
    public void agregarPedido (Pedido pedido){
        assert listaPedidos != null;
        //assert !productoSinStock (pedido.geProductoPedido().getCantidadStock());
        listaPedidos.add(pedido);
    }

    /*
     * Método para agregar un producto
     */
    public void agregarProducto (Producto producto){
        assert listaProductos != null;
        listaProductos.add(producto);
    }

    /*
     * Método para agregar una persona
     */
    public void agregarPersona (Persona persona){
        listaPersonas.add(persona);
    }

    /*
     * Método para obtener la lista de productos con cantidad de stock superior a 100
     */
    public Collection <Producto> getProductoStock100 (){
        return listaProductos.stream().filter(producto -> producto.getCantidadStock() > 100).toList();
    }

    /*
     * Método toString
     */
    @Override
    public String toString() {
        return "Drogueria [nombre=" + nombre + ", listaPersonas=" + listaPersonas + ", listaProductos=" + listaProductos
                + ", listaPedidos=" + listaPedidos + "]";
    }

}
