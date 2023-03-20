package Decorator.tarea1;

public class Turbo extends Accesorios{
    public Turbo(Automovil automovil, int costo) {
        super(automovil, costo);
    }
    @Override
    public void operation() {
        super.operation();
        System.out.println("Tipo de la mejora: Turbo>>>>");
    }
}
