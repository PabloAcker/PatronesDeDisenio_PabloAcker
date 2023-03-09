package segundoParcial.fila2.ej3;

public class Video implements INotificacion {

    private String msg = "La pagina a la que sigues acaba de subir un nuevo video!";

    @Override
    public String getMsg() {
        return msg;
    }
}
