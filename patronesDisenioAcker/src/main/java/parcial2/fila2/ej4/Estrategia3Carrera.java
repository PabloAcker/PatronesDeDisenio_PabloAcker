package segundoParcial.fila2.ej4;

import java.util.Comparator;
import java.util.List;

public class Estrategia3Carrera implements IOrden {
    @Override
    public void ordenar(List<Estudiante> estudianteList) {
        estudianteList.sort(Comparator.comparing(Estudiante::getCarrera));
        for(Estudiante estudiante : estudianteList) {
            estudiante.showInfo();
        }

    }
}
