package parcial1.factory.b;

public class Medias implements IProducto{
    private int precio;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void crearProducto() {
        System.out.println("Mostrando Informacion de unas medias...");
        System.out.println("Precio de las medias: "+ getPrecio());
    }
}
