package visitor.tarea1;

public interface ILibreCambista {
    void cambiarBillete(Bolivia bolivia, int monto);
    void cambiarBillete(EEUU eeuu, int monto);
    void cambiarBillete(Europa europa, int monto);
}
