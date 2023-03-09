package segundoParcial.fila2.ej1;

public class Archivo {

    private String id;
    private String oracion;
    private String nuevaOracion;

    public Archivo(String id, String oracion, String nuevaOracion) {
        this.id = id;
        this.oracion = oracion;
        this.nuevaOracion = nuevaOracion;
    }

    public String getNuevaOracion() {
        return nuevaOracion;
    }

    public void setNuevaOracion(String nuevaOracion) {
        this.nuevaOracion = nuevaOracion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOracion() {
        return oracion;
    }

    public void setOracion(String oracion) {
        this.oracion = oracion;
    }

    public void showInfo() {
        System.out.println("Mostrando informacion del archivo>>>>>>");
        System.out.println("ID: " + getId());
        System.out.println("Oracion: " + getOracion());
    }

}
