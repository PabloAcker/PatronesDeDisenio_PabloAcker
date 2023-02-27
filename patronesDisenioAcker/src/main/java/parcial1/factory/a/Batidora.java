package parcial1.factory.a;

public class Batidora implements IArtefacto{
    private int precio;
    @Override
    public void create() {
        System.out.println("Mostrando Informacion de una Batidora...");
        System.out.println("Precio de batidora: "+getPrecio());
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
