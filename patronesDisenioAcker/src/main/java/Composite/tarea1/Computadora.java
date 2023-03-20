package Composite.tarea1;

public class Computadora extends ContenedorCompus{
    public Computadora(int precio){
        super(precio);
    }

    @Override
    public void showInfo() {
        System.out.println("precio: " + getPrecio());
    }

    @Override
    public void add(ContenedorCompus contenedorCompus) {
        //TODO
    }

    @Override
    public void remove(ContenedorCompus contenedorCompus) {
        //TODO
    }
}
