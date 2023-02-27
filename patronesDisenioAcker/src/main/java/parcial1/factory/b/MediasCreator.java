package parcial1.factory.b;

public class MediasCreator extends CreatorProducto{
    @Override
    public Medias create() {
        Medias medias = new Medias();
        medias.setPrecio(60);
        medias.crearProducto();

        return medias;
    }
}
