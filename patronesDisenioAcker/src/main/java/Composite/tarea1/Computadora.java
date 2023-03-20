package Composite.tarea1;

public class Computadora extends ContenedorCompus{

    public Computadora(String tipo) {
        super(tipo);
        setPrecio(100);
    }
    @Override
    public String showInfo() {
        return "\t" + getTipo()+" tiene un precio total de >>>\n" + "\t Precio: " + getPrecio() + "\n";
    }
    @Override
    public void calcularPrecio() {
        Singleton.getInstance().add(this.showInfo());
    }

    @Override
    public void add(ContenedorCompus contenedorCompus) {
    }

    @Override
    public void remove(ContenedorCompus contenedorCompus) {
    }
}
