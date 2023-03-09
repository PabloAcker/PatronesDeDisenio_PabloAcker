package segundoParcial.fila1.ej4;

import java.util.List;

public class Estrategia3Categoria implements IStrategy {

    @Override
    public void ordenar(List<Libro> list, String id, String titulo, String categoria){
        System.out.println("Ordenando por Categoria...");
        for (Libro libros : list) {
            if(libros.getCategoria().equals(categoria)) {
                libros.showInfoLibro();
            }
        }
    }
}
