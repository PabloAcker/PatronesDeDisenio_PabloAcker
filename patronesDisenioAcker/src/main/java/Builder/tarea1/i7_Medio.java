package Builder.tarea1;

public class i7_Medio extends BuilderComputadoras{
    @Override
    public void buildMonitor() {
        this.computadoras.setMonitor("32");
    }

    @Override
    public void buildTeclado() {
        this.computadoras.setTeclado("luminos");
    }

    @Override
    public void buildMouse() {
        this.computadoras.setMouse("luminos");
    }

    @Override
    public void buildMemoria() {
        this.computadoras.setMemoria("16gb");
    }

    @Override
    public void buildProcesador() {
        this.computadoras.setProcesador("i7");
    }

    @Override
    public void buildVideo() {
        this.computadoras.setVideo("8");
    }
}
