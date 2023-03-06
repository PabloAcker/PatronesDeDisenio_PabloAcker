package state.tarea1;

public class Reiniciar implements IStateComputer{
    @Override
    public void computerBehavior(Computadora computadora) {
        System.out.println("Los programas se estan cerrando para el reinicio...");
        computadora.getConsumoMemoriaRAM().showInfoMemoryRAM();
        computadora.getConsumoCPU().showInfoCPU();
    }
}
