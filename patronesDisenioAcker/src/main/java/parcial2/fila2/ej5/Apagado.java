package segundoParcial.fila2.ej5;

import java.util.Arrays;

public class Apagado implements IEstado {
    @Override
    public void setStateComputadora(Computadora computadora) {
        System.out.println("La computadora esta apagada");
        computadora.setConsumoRam(10);
        computadora.setConsumoCPU(10);
        Arrays.fill(computadora.getProgramasAbiertos(), "Cerrado");

    }
}
