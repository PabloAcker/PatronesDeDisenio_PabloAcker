package parcial1.factory.b;

public class Camiseta implements IProducto {
    private int precio;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void crearProducto() {
        System.out.println("Mostrando Informacion de una camiseta...");
        System.out.println("Precio de la camiseta: "+ getPrecio());

    }
}
