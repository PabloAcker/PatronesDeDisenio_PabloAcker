package segundoParcial.fila1.ej3;

public class Usuario implements IUser {
    private String tipoNotificacion;
    private String name;

    public Usuario(String tipoNotificacion, String name) {
        this.tipoNotificacion = tipoNotificacion;
        this.name = name;
    }

    public String getTipoNotificacion() {
        return tipoNotificacion;
    }

    public void setTipoNotificacion(String tipoNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println("El usuario "+ getName() + " recibio una notificacion de tipo: "
                + getTipoNotificacion() + "\n" + msg);
        System.out.println("===========================================");
    }
}
