package state.tarea1;

public class Apagado implements IStateComputer{
    @Override
    public void computerBehavior(Computadora computadora) {
        computadora.getConsumoMemoriaRAM().setPorcentajeDeUso(10);
        computadora.getConsumoCPU().setPorcentajeDeUso(10);
        computadora.setProgramasAbiertos(" ");
        System.out.println("Estado: Apagado");
        computadora.getConsumoMemoriaRAM().showInfoMemoryRAM();
        computadora.getConsumoCPU().showInfoCPU();
    }
}
