package parcial1.factory.b;

public class CamisetaCreator extends CreatorProducto{
    @Override
    public Camiseta create() {
        Camiseta camiseta = new Camiseta();
        camiseta.setPrecio(200);
        camiseta.crearProducto();

        return camiseta;
    }
}
