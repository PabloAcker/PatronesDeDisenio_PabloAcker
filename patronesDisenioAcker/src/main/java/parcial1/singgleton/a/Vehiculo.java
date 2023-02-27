package parcial1.singgleton.a;

public class Vehiculo {
    private String placa;
    private String modelo;
    private String color;
    private int tipoPago;

    public Vehiculo(String placa, String modelo, String color, int tipoPago) {
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.tipoPago = tipoPago;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(int tipoPago) {
        this.tipoPago = tipoPago;
    }

    public void registro(){
        Peaje.getInstance().registro(placa, modelo, color);
    }
    public void dineroRecaudado(){
        Peaje.getInstance().dineroRecaudado(tipoPago);
    }

}
