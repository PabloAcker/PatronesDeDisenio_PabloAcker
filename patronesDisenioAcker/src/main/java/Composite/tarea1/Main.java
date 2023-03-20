package Composite.tarea1;

public class Main {
    public static void main(String[] args) {
        Computadora compu1 = new Computadora("Computadora");
        Computadora compu2 = new Computadora("Computadora");
        Computadora compu3 = new Computadora("Computadora");


        Laboratorio laboratorio1 = new Laboratorio("Laboratorio");
        Laboratorio laboratorio2 = new Laboratorio("Laboratorio");

        laboratorio1.add(compu1);
        laboratorio1.add(compu2);

        laboratorio2.add(compu3);

        Laboratorio contenedor1 = new Laboratorio("Contenedor de Computadoras");

        contenedor1.add(laboratorio1);
        contenedor1.add(laboratorio2);

        contenedor1.setUltimo(true);

        contenedor1.calcularPrecio();
        System.out.println("===========================================");
        System.out.println("Precio total: " + Singleton.getInstance().getPrecioGlobal());

    }
}
