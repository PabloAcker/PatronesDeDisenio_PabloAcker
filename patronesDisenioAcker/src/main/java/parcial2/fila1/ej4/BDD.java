package segundoParcial.fila1.ej4;

import java.util.ArrayList;
import java.util.List;

public class BDD {
    List<Libro> libros = new ArrayList<>();
    IStrategy strategy;
    public BDD() {}
    public void addLibros(Libro libro){
        libros.add(libro);
    }
    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void iniciarOrden(String id, String titulo, String categoria){
        strategy.ordenar(libros, id, titulo, categoria);
    }
}
