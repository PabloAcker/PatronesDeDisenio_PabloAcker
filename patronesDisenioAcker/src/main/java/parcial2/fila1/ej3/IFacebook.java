package segundoParcial.fila1.ej3;

public interface IFacebook {
    void suscribir(Usuario observer);
    void borrar(Usuario observer);
    void notificarSubs(String msg, String tipo);
}
