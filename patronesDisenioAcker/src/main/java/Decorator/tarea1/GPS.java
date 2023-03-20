package Decorator.tarea1;

public class GPS extends Accesorios{
    public GPS(Automovil automovil, int costo) {
        super(automovil, costo);
    }
    @Override
    public void operation() {
        super.operation();
        System.out.println("Tipo de la mejora: GPS>>>>");
    }
}
