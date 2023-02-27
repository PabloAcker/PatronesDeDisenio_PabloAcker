package parcial1.factory.b;

public class Main {
    public static void main (String[]args){

        System.out.println("============================================");
        Camiseta camiseta = new CamisetaCreator().create();
        camiseta.setPrecio(400);
        camiseta.crearProducto();

        System.out.println("============================================");
        Medias medias = new MediasCreator().create();
        medias.setPrecio(90);
        medias.crearProducto();

        System.out.println("============================================");
        PelotaFutbol pelotaFutbol = new PelotaFutbolCreator().create();
        pelotaFutbol.setPrecio(300);
        pelotaFutbol.crearProducto();

        System.out.println("============================================");
        Shorts shorts = new ShortsCreator().create();
        shorts.setPrecio(800);
        shorts.crearProducto();

        System.out.println("============================================");
        Tenis tenis = new TenisCreator().create();
        tenis.setPrecio(600);
        tenis.crearProducto();

    }
}
