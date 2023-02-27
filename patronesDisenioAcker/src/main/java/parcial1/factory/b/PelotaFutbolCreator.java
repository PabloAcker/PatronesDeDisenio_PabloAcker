package parcial1.factory.b;

public class PelotaFutbolCreator extends CreatorProducto{
    @Override
    public PelotaFutbol create() {
        PelotaFutbol pelotaFutbol = new PelotaFutbol();
        pelotaFutbol.setTamanio("Mediana");
        pelotaFutbol.setColor("Blanco");
        pelotaFutbol.setGarantia("2 años");
        pelotaFutbol.setPrecio(70);
        pelotaFutbol.crearProducto();

        return pelotaFutbol;
    }
}
