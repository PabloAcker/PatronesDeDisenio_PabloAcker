package parcial1.singgleton.b;

public class Estudiante {
    private String nombre;
    private String ci;
    private TemaTesis temaTesis;
    public Estudiante(String nombre, String ci, TemaTesis temaTesis) {
        this.nombre = nombre;
        this.ci = ci;
        this.temaTesis = temaTesis;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public TemaTesis getTemaTesis() {
        return temaTesis;
    }

    public void setTemaTesis(TemaTesis temaTesis) {
        this.temaTesis = temaTesis;
    }
    public void registroTesis(){
        AlmacenTesis.getInstance().inscribirTesis(temaTesis);
    }
}
