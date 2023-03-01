package ChainOfResponsability.tarea1;

public interface IHandler {
    void setNext(IHandler handler);
    IHandler next();

    void reporteProblema(Cliente cliente, String titulo, String severidad, String descripcion);
}
