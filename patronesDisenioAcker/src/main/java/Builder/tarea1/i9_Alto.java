package Builder.tarea1;

public class i9_Alto extends BuilderComputadoras{
    @Override
    public void buildMonitor() {
        this.computadoras.setMonitor("45");
    }

    @Override
    public void buildTeclado() {
        this.computadoras.setTeclado("luminos");
    }

    @Override
    public void buildMouse() {
        this.computadoras.setMouse("gamer");
    }

    @Override
    public void buildMemoria() {
        this.computadoras.setMemoria("32gb");
    }

    @Override
    public void buildProcesador() {
        this.computadoras.setProcesador("i9");
    }

    @Override
    public void buildVideo() {
        this.computadoras.setVideo("16");
    }
}
