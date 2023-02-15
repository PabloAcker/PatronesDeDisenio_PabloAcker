package Builder.tarea1;

public class Computadoras {
    private String monitor;
    private String teclado;
    private String mouse;
    private String memoria;

    private String procesador;

    private String video;

    public String getMonitor() {
        return monitor;
    }

    public Computadoras setMonitor(String monitor) {
        this.monitor = monitor;
        return this;
    }

    public String getTeclado() {
        return teclado;
    }

    public Computadoras setTeclado(String teclado) {
        this.teclado = teclado;
        return this;
    }

    public String getMouse() {
        return mouse;
    }

    public Computadoras setMouse(String mouse) {
        this.mouse = mouse;
        return this;
    }

    public String getMemoria() {
        return memoria;
    }

    public Computadoras setMemoria(String memoria) {
        this.memoria = memoria;
        return this;
    }

    public String getProcesador() {
        return procesador;
    }

    public Computadoras setProcesador(String procesador) {
        this.procesador = procesador;
        return this;
    }

    public String getVideo() {
        return video;
    }

    public Computadoras setVideo(String video) {
        this.video = video;
        return this;
    }

    public void showInfoCompus() {
        System.out.println("Mostrando información de la computadora>>>>>>>");
        System.out.println(" ");
        System.out.println("Tiene un Monitor: " + getMonitor());
        System.out.println("Tiene un Teclado: " + getTeclado());
        System.out.println("Tiene un Mouse: " + getMouse());
        System.out.println("Tiene una Memoria: " + getMemoria());
        System.out.println("Tiene un Procesador: " + getProcesador());
        System.out.println("Tiene un Video: " + getVideo());
        System.out.println("////////////////////////////////////////////////////");
        System.out.println(" ");
    }
}
