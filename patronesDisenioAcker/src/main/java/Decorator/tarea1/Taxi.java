package Decorator.tarea1;

public class Taxi implements Automovil{
    private String placa;
    private String velocidad;
    private boolean avanzar;

    public Taxi(String placa, String velocidad, boolean avanzar) {
        this.placa = placa;
        this.velocidad = velocidad;
        this.avanzar = avanzar;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public void operation() {
        System.out.println("El taxi tiene la velocidad de: " + getVelocidad());
        System.out.println("El taxi puede avanzar: " + isAvanzar());
        System.out.println("El taxi tiene la placa: " + getPlaca());
    }
}
