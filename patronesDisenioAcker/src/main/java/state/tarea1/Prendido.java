package state.tarea1;

public class Prendido implements IStateComputer{
    @Override
    public void computerBehavior(Computadora computadora) {
        int actualUseRam = computadora.getConsumoMemoriaRAM().getPorcentajeDeUso();
        int actualUseCPU = computadora.getConsumoCPU().getPorcentajeDeUso();

        while (computadora.getConsumoMemoriaRAM().getPorcentajeDeUso() < 100 || computadora.getConsumoCPU().getPorcentajeDeUso() < 100) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (computadora.getProgramasAbiertos().equals("AnyDesk")) {
                actualUseRam = actualUseRam + 10;
                computadora.getConsumoMemoriaRAM().setPorcentajeDeUso(actualUseRam);
                computadora.getConsumoMemoriaRAM().showInfoMemoryRAM();

                actualUseCPU = actualUseCPU + 10;
                computadora.getConsumoCPU().setPorcentajeDeUso(actualUseCPU);
                computadora.getConsumoCPU().showInfoCPU();
            } else if (computadora.getProgramasAbiertos().equals("AndroidStudio")) {
                actualUseRam = actualUseRam + 20;
                computadora.getConsumoMemoriaRAM().setPorcentajeDeUso(actualUseRam);
                computadora.getConsumoMemoriaRAM().showInfoMemoryRAM();

                actualUseCPU = actualUseCPU + 20;
                computadora.getConsumoCPU().setPorcentajeDeUso(actualUseCPU);
                computadora.getConsumoCPU().showInfoCPU();
            } else if (computadora.getProgramasAbiertos().equals("Discord")) {
                actualUseRam = actualUseRam + 5;
                computadora.getConsumoMemoriaRAM().setPorcentajeDeUso(actualUseRam);
                computadora.getConsumoMemoriaRAM().showInfoMemoryRAM();

                actualUseCPU = actualUseCPU + 5;
                computadora.getConsumoCPU().setPorcentajeDeUso(actualUseCPU);
                computadora.getConsumoCPU().showInfoCPU();
            } else if (computadora.getProgramasAbiertos().equals("CSGO")) {
                actualUseRam = actualUseRam + 25;
                computadora.getConsumoMemoriaRAM().setPorcentajeDeUso(actualUseRam);
                computadora.getConsumoMemoriaRAM().showInfoMemoryRAM();

                actualUseCPU = actualUseCPU + 25;
                computadora.getConsumoCPU().setPorcentajeDeUso(actualUseCPU);
                computadora.getConsumoCPU().showInfoCPU();
            }
            if (actualUseRam > 100) {
                computadora.getConsumoMemoriaRAM().setPorcentajeDeUso(100);
                System.out.println("El uso actual de la RAM esta al 100%");
            }
            if (actualUseCPU > 100) {
                computadora.getConsumoCPU().setPorcentajeDeUso(100);
                System.out.println("El uso actual de consumo de la CPU esta al 100%");
            }
        }
        System.out.println("Ya esta al maximo de rendimiento la computadora!");
    }
}
