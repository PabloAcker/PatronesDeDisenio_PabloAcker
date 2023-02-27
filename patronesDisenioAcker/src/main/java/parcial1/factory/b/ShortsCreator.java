package parcial1.factory.b;

public class ShortsCreator extends CreatorProducto{
    @Override
    public Shorts create() {
        Shorts shorts = new Shorts();
        shorts.setPrecio(120);
        shorts.crearProducto();

        return shorts;
    }
}
