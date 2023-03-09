package segundoParcial.fila1.ej5;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Celular celular = new Celular(new Apagado(),"8GB");
        celular.setEstado(new Reiniciar());
        celular.useCel();

        celular.setEstado(new Apagado());
        celular.useCel();

        celular.setEstado(new Prendido());
        celular.useCel();
    }
}
