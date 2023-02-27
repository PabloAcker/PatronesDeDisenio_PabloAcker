package parcial1.singgleton.b;

public class TemaTesis {
    private String titulo;
    private String mencion;

    public TemaTesis(String titulo, String mencion) {
        this.titulo = titulo;
        this.mencion = mencion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMencion() {
        return mencion;
    }

    public void setMencion(String mencion) {
        this.mencion = mencion;
    }

}
