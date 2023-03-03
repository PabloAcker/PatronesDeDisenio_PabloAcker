package observer.tarea1;
import java.util.List;
public interface ICliente {
    void subirNotificacion(String message, Propaganda propaganda);
    void setCategoriaPropaganda(List<String> categoria);
    List<String> getCategoriaPropaganda();
}
