package parcial1.factory.b;

public class PelotaFutbol implements IProducto {
    private String tamanio;
    private String color;
    private String garantia;
    private int precio;

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void crearProducto() {
        System.out.println("Mostrando Informacion de una pelota de futbol...");
        System.out.println("Precio de la pelota de futbol: "+ getPrecio());
    }
}
