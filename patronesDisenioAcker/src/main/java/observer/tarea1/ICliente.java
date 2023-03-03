package observer.tarea1;

public interface ICliente {
    void subirNotificacion(String message, Propaganda propaganda);
    void setCategoriaPropaganda(String categoria);
    String getCategoriaPropaganda();
}
