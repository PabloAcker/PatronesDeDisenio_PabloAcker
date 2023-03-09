package segundoParcial.fila2.ej3;

public class Imagen implements INotificacion {

    private String msg = "La pagina a la que sigues subio una nueva publicacion!";

    @Override
    public String getMsg() {
        return msg;
    }
}
