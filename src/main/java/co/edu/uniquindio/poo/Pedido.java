package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Pedido {
    private final LocalDate fecha;
    private final int cantidad;
    private final Producto productoPedido;
    private final Cliente clientePedido;

    /*
     * Método constructor de la clase Pedido
     */
    public Pedido(LocalDate fecha, int cantidad, Producto producto, Cliente cliente){
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.productoPedido = producto;
        this.clientePedido = cliente;
        assert productoPedido.getCantidadStock() > 0;
    }

    /*
     * Método para obener una fecha
     */
    public LocalDate getFecha (){
        return fecha;
    }

    /*
     * Método para obener una cantidad de un pedido
     */
    public int getCantidad (){
        return cantidad;
    }

    /*
     * Método para obtener el producto pedido
     */
    public Producto geProductoPedido(){
        return productoPedido;
    }

    /*
     * Método para obtener un cliente 
     */
    public Cliente gClientePedido (){
        return clientePedido;
    }

    /*
     * Método para calcular el valor de un pedido
     */
    public double calcularValorPedido (){
        return getCantidad() * productoPedido.getPrecio();
    }

    /*
     * Método toString
     */
    @Override
    public String toString() {
        return "Pedido [fecha=" + fecha + ", cantidad=" + cantidad + ", productoPedido=" + productoPedido
                + ", clientePedido=" + clientePedido + "]";
    }
}