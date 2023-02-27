package parcial1.factory.b;

public class TenisCreator extends CreatorProducto{
    @Override
    public Tenis create() {
        Tenis tenis = new Tenis();
        tenis.setPrecio(500);
        tenis.crearProducto();

        return tenis;
    }
}
