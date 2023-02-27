package parcial1.factory.a;

public class Refrigerador implements IArtefacto{
    private int precio;
    @Override
    public void create() {
        System.out.println("Mostrando Informacion de un Refrigerador...");
        System.out.println("Precio del Refrigerador: "+getPrecio());
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
