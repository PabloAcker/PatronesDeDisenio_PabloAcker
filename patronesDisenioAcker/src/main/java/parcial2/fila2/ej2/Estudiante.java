package segundoParcial.fila2.ej2;

public class Estudiante extends Jugador{
    public Estudiante(IChat chatJuegos, String alias, String nombre, String ranking) {
        super(chatJuegos, alias, nombre, ranking);
    }

    @Override
    public void send(String msg) {
        chatJuego.send(msg, this);
    }

    @Override
    public void received(String msg) {
        System.out.println("El estudiante con el nombre: " +getNombre()+ ", recibio con exito el siguiente mensaje: \n" + msg);
    }
}
