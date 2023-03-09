package segundoParcial.fila2.ej4;

import java.util.Comparator;
import java.util.List;

public class Estrategia2Nombre implements IOrden {
    @Override
    public void ordenar(List<Estudiante> estudianteList) {
        estudianteList.sort(Comparator.comparing(Estudiante::getNombre));
        for(Estudiante estudiante : estudianteList) {
            estudiante.showInfo();
        }
    }
}
