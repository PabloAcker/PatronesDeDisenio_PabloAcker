package Builder.tarea1;

public class Vendedor {
    private BuilderComputadoras builder;

    public Computadoras getComputadoras(){
        return builder.getComputadoras();
    }

    public void setTipoComputadora(BuilderComputadoras builder){
        this.builder = builder;
    }

    public void buildCompus(){
        this.builder.venderComputadoras();
        this.builder.buildMonitor();
        this.builder.buildTeclado();
        this.builder.buildMouse();
        this.builder.buildMemoria();
        this.builder.buildProcesador();
        this.builder.buildVideo();
    }
}
