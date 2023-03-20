package Decorator.tarea1;

public class TanqueGas extends Accesorios{
    public TanqueGas(Automovil automovil, int costo) {
        super(automovil, costo);
    }
    @Override
    public void operation() {
        super.operation();
        System.out.println("Tipo de la mejora: Tanque funcionando con Gas>>>>");
    }
}
