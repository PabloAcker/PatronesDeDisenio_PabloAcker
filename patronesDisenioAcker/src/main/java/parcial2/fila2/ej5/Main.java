package segundoParcial.fila2.ej5;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Computadora computadora = new Computadora();
        computadora.setEstado(new Apagado());

        computadora.computadoraResourceManager();
        computadora.showComputadora();

        System.out.println("\n ================================= \n");

        computadora.setEstado(new Reiniciar());
        computadora.computadoraResourceManager();
        computadora.showComputadora();

        System.out.println("\n ================================= \n");

        computadora.setEstado(new Prendido());
        computadora.computadoraResourceManager();
    }

}
