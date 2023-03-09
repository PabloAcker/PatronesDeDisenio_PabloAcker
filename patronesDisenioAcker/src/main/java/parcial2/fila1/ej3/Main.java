package segundoParcial.fila1.ej3;

public class Main {
    public static void main(String[] args){
        Facebook facebook = new Facebook();
        facebook.suscribir(new Usuario("video", "Ema"));
        facebook.suscribir(new Usuario("imagen", "Nico"));
        facebook.suscribir(new Usuario("video", "Charlie"));
        facebook.suscribir(new Usuario("imagen", "Lago"));
        facebook.suscribir(new Usuario("video", "Rene"));

        facebook.sendNotificacion("video", "Ibai Llanos acaba de subir un nuevo video");
        facebook.sendNotificacion("imagen", "Cristiano Ronaldo acaba de subir una nueva foto");
    }
}
