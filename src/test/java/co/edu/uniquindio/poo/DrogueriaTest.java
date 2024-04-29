package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class DrogueriaTest {
    private static final Logger LOG = Logger.getLogger(DrogueriaTest.class.getName());

    @Test
    public void pedidosSinStock (){
        LOG.info("Inicio test pedidos con productos sin stock");
        assertThrows(Throwable.class, ()-> new Pedido(LocalDate.of(2024, 04, 22), 6, 
        new ProductoHogar("124", "Crema Hidratante", "Crema hidratante con vitamina", 200,
         0, "5006", "Aplicar"), 
        new Cliente("Lawrence", "Daniel", "46553", "Calle 3", "123456789")));
        LOG.info("Fin test pedidos con productos sin stock");
    }

    @Test
    public void ProductosStock100 (){
        LOG.info("Inicio test obtener productos con stock mayor a 100");
        var drogueria = new Drogueria("lau");

        CuidadoPersonal producto1 = new CuidadoPersonal("salicilico", "9247733", "Jabon", "jabon con olor a fresas",
         15000, 24, "98765321");
        ProductoHogar producto2 = new ProductoHogar("7832643", "Jabon", "Jabon para lavar la ropa", 8000,
         23, "37439847", "Mantener fuera del alcance de los niños");
        Medicamento producto3 = new Medicamento(232, "lau", "lau", "lau", 83734, 111, "lau");

        drogueria.agregarProducto(producto3);
        drogueria.agregarProducto(producto2);
        drogueria.agregarProducto(producto1);

        Collection<Producto> listaEsperada = List.of(producto3, producto1);

        assertIterableEquals(listaEsperada, drogueria.getProductoStock100());

        LOG.info("Fin test obtener productos con stock mayor a 100");
    }

    @Test 
    public void costoTotalPedido (){
        LOG.info("Inicio test calcular el costo total de un pedido");
        var drogueria = new Drogueria("a");
        Pedido  pedido = new Pedido(LocalDate.of(2024, 04, 22), 32, 
        new CuidadoPersonal("Niacinamida", "1234", "Jabon limpiador de rostro", "Aplicar tres dias en la semana",
         45000, 34, "1234"), 
        new Cliente("Lawrence", "Daniel", "1234", "calle 3", "372637"));
        drogueria.agregarPedido(pedido);
        assertEquals(1440000, pedido.calcularValorPedido(), 0.05, App.PRECISION);
        LOG.info("Fin test calcular el costo total de un pedido");
    }
}