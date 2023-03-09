package segundoParcial.fila2.ej5;

import java.util.Arrays;

public class Reiniciar implements IEstado {
    @Override
    public void setStateComputadora(Computadora computadora) {
        System.out.println("La computadora se esta reiniciando...");
        computadora.setConsumoRam(0);
        computadora.setConsumoCPU(0);
        Arrays.fill(computadora.getProgramasAbiertos(), "Cerrado");
    }
}
