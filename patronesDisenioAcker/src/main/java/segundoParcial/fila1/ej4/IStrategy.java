package segundoParcial.fila1.ej4;

import java.util.List;

public interface IStrategy {
    void ordenar(List<Libro> list, String id, String titulo, String categoria);
}
