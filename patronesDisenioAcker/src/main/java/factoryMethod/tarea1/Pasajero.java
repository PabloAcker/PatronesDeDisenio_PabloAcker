package factoryMethod.tarea1;

public class Pasajero {
    private String nombre;
    private int ci;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public void showInfoPasajero() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("CI: " + getCi());
    }
}
