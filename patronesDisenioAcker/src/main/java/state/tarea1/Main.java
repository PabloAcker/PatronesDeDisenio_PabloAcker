package state.tarea1;

public class Main {
    public static void main(String[] args) {

        MemoriaRAM memoriaRAM = new MemoriaRAM(0,"100");
        CPU cpu = new CPU(0,"100");
        Computadora computadora = new Computadora("CSGO",memoriaRAM,cpu);

        computadora.setStateComputer(new Prendido());
        computadora.useCOmputer();

        //computadora.setStateComputer(new Apagado());
        //computadora.useCOmputer();

        //computadora.setStateComputer(new Reiniciar());
        //computadora.useCOmputer();
    }
}
