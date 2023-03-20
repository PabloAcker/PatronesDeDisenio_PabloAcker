package Decorator.tarea1;

public class Main {
    public static void main(String[] args) {
        Automovil minibus = new Minibus("3965HDK", "200mps", false);

        minibus = new Turbo(minibus, 2000);
        minibus = new GPS(minibus, 500);
        minibus = new TanqueGas(minibus, 1500);

        minibus.operation();
        System.out.println("================================\n");

        Automovil taxi = new Taxi("5831HFA", "150mps", true);

        taxi = new TanqueGas(taxi, 800);

        taxi.operation();
        System.out.println("=================================\n");

        Automovil vagoneta = new Vagoneta("3141JLF", "300mps", true);

        vagoneta = new Turbo(vagoneta, 3000);
        vagoneta = new GPS(vagoneta, 8000);

        vagoneta.operation();
        System.out.println("=================================\n");
    }
}
