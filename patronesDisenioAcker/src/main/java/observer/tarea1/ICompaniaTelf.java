package observer.tarea1;

import java.util.List;

public interface ICompaniaTelf {
    void asociamiento(ICliente cliente, List<String> categoria);
    void removeAsociamiento(ICliente cliente);
    void notificacion(Propaganda propaganda);
}
