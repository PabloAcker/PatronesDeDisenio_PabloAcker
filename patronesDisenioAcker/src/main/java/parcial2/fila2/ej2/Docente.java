package segundoParcial.fila2.ej2;

public class Docente extends Jugador{
    public Docente(IChat chatJuegos, String alias, String nombre, String ranking) {
        super(chatJuegos, alias, nombre, ranking);
    }

    @Override
    public void send(String msg) {

        chatJuego.send(msg, this);

    }

    @Override
    public void received(String msg) {

        System.out.println("El docente con el nombre: " +getNombre()+ ", recibio con exito el siguiente mensaje: \n" + msg);

    }
}
