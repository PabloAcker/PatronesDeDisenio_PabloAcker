package Builder.tarea1;

public abstract class BuilderComputadoras {
    protected Computadoras computadoras;

    public Computadoras getComputadoras(){
        return computadoras;
    }

    public void venderComputadoras(){
        computadoras = new Computadoras();
    }
    public abstract void buildMonitor();
    public abstract void buildTeclado();
    public abstract void buildMouse();
    public abstract void buildMemoria();
    public abstract void buildProcesador();
    public abstract void buildVideo();
}
