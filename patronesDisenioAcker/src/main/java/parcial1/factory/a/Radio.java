package parcial1.factory.a;

public class Radio implements IArtefacto{
    private int precio;
    @Override
    public void create() {
        System.out.println("Mostrando Informacion de una Radio...");
        System.out.println("Precio de Radio: "+getPrecio());
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
