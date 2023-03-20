package Composite.tarea1;

public class Main {
    public static void main(String[] args) {
        Computadora computadora1 = new Computadora(100);
        Computadora computadora2 = new Computadora(100);
        Computadora computadora3 = new Computadora(100);

        Laboratorio laboratorio1 = new Laboratorio(0);
        Laboratorio laboratorio2 = new Laboratorio(0);

        laboratorio1.add(computadora1);
        laboratorio1.add(computadora2);

        laboratorio2.add(computadora3);

        Laboratorio contenedor = new Laboratorio(0);
        contenedor.add(laboratorio1);
        contenedor.add(laboratorio2);
        contenedor.showInfo();
    }
}
