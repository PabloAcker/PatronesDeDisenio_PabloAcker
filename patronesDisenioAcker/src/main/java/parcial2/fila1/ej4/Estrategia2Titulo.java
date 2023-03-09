package segundoParcial.fila1.ej4;

import java.util.List;

public class Estrategia2Titulo implements IStrategy {

    @Override
    public void ordenar(List<Libro> list, String id, String titulo, String categoria){
        System.out.println("Ordenando por Titulo...");
        for (Libro libros : list) {
            if(libros.getTitulo().equals(titulo)) {
                libros.showInfoLibro();
            }
        }
    }
}
