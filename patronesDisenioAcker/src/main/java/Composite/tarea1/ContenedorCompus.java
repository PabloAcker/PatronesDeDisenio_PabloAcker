package Composite.tarea1;

public abstract class ContenedorCompus {
    private int precio;

    public ContenedorCompus(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public abstract void showInfo();
    public abstract void add(ContenedorCompus contenedorCompus);
    public abstract void remove(ContenedorCompus contenedorCompus);
}
