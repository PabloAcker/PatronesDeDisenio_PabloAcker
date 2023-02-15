package Builder.tarea1;

public class i5_Bajo extends BuilderComputadoras{
    @Override
    public void buildMonitor() {
        this.computadoras.setMonitor("24");
    }

    @Override
    public void buildTeclado() {
        this.computadoras.setTeclado("normal");
    }

    @Override
    public void buildMouse() {
        this.computadoras.setMouse("normal");
    }

    @Override
    public void buildMemoria() {
        this.computadoras.setMemoria("8gb");
    }

    @Override
    public void buildProcesador() {
        this.computadoras.setProcesador("i5");
    }

    @Override
    public void buildVideo() {
        this.computadoras.setVideo("4");
    }
}
