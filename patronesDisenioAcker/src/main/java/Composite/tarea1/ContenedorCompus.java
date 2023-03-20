package Composite.tarea1;

public abstract class ContenedorCompus {
    private int precio;
    private String tipo;
    private boolean ultimo;

    public ContenedorCompus(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isUltimo() {
        return ultimo;
    }

    public void setUltimo(boolean ultimo) {
        this.ultimo = ultimo;
    }

    public abstract String showInfo();
    public abstract void calcularPrecio();
    public abstract void add(ContenedorCompus contenedorCompus);
    public abstract void remove(ContenedorCompus contenedorCompus);
}
