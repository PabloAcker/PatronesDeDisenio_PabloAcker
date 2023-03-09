package segundoParcial.fila2.ej3;

public class Main {
    public static void main(String[] args) {
        Web web = new Web();
        Usuario user1 = new Usuario("Ema", true);
        Usuario user2 = new Usuario("Brenda", true);
        Usuario user3 = new Usuario("Enrique", false);
        Usuario user4 = new Usuario("Hugo", true);
        Usuario user5 = new Usuario("Eynar", false);

        web.add(user1);
        web.add(user2);
        web.add(user3);
        web.add(user4);
        web.add(user5);

        web.notificarUsurio(new Video());
        System.out.println("\n ======================================== \n");
        web.notificarUsurio(new Imagen());
    }
}
