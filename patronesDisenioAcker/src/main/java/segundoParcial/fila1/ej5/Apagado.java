package segundoParcial.fila1.ej5;

public class Apagado implements IEstado {

    @Override
    public void celBehavior(Celular celular) {
        celular.setProgramasAbiertos(0);
        celular.setConsumoCPU(10);
        System.out.println("El celular está apagado");
        System.out.println("Programas abiertos: " + celular.getProgramasAbiertos());
        System.out.println("Uso de recursos: " + celular.getConsumoCPU() + "%");
        System.out.println("Uso de memoria RAM: " + celular.getMemoriaRAM());
        System.out.println("=================================");
    }
}
