package segundoParcial.fila1.ej4;

import java.util.List;

public class Estrategia1ID implements IStrategy {

    @Override
    public void ordenar(List<Libro> list, String id, String titulo, String categoria){
        System.out.println("Ordenando por ID...");
        for (Libro libros : list) {
            if(libros.getId().equals(id)) {
                libros.showInfoLibro();
            }
        }
    }
}
