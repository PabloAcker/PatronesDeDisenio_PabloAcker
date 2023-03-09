package segundoParcial.fila2.ej3;

public class Usuario implements IUser{

    private String name;
    private boolean isSoloVideos;

    public Usuario(String name, boolean isSoloVideos) {
        this.name = name;
        this.isSoloVideos = isSoloVideos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getUpdated(INotificacion notificacion) {
        System.out.println(getName()+" recibio el siguiente mensaje exitosamente: \n"+notificacion.getMsg());
    }

    @Override
    public boolean isSoloVideos() {
        return isSoloVideos;
    }
}
