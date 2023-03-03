package observer.tarea1;

public interface ICompaniaTelf {
    void asociamiento(ICliente cliente, String categoria);
    void removeAsociamiento(ICliente cliente);
    void notificacion(Propaganda propaganda);
}
