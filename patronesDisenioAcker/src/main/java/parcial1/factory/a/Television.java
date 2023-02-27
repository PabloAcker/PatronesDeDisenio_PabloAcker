package parcial1.factory.a;

public class Television implements IArtefacto {
    private int precio;
    @Override
    public void create() {
        System.out.println("Mostrando Informacion de una television...");
        System.out.println("Precio de Television: "+getPrecio());
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
