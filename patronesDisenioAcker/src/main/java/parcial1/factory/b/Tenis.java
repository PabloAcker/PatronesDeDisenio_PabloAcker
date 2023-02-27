package parcial1.factory.b;

public class Tenis implements IProducto{
    private int precio;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void crearProducto() {
        System.out.println("Mostrando Informacion de unos tenis...");
        System.out.println("Precio de los tenis: "+ getPrecio());
    }
}
