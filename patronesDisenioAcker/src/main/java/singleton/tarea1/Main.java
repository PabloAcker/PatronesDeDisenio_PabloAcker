package singleton.tarea1;

import java.io.IOException;
public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Clientes cliente = new Clientes("/");
        cliente.setName("Pepe");

        Productos producto = new Productos("PC");
        producto.getName_product();

        Facturas factura = new Facturas("11234");

        Promociones promocion = new Promociones("San Valentin");
        promocion.getName_promocion();
        Logger.getInstance().finish();
    }
}
