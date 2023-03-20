package Decorator.tarea1;

public class Accesorios implements Automovil{
    private Automovil automovil;
    private int costo;

    public Accesorios(Automovil automovil, int costo) {
        this.automovil = automovil;
        this.costo = costo;
    }

    @Override
    public void operation() {
        automovil.operation();
        System.out.println("Mostrando las nuevas mejoras>>>>");
        System.out.println("Costo de la mejora: " + costo + "$");
    }
}
