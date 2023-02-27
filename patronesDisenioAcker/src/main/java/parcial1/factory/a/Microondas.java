package parcial1.factory.a;

public class Microondas implements IArtefacto{
    private int precio;
    @Override
    public void create() {
        System.out.println("Mostrando Informacion de un Microondas...");
        System.out.println("Precio del Microondas: "+getPrecio());
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
