package parcial1.builder.b;

public class Plataforma {
    private BuilderContrato builder;
    public Contrato getContrato() {return builder.getContrato();}
    public void setTipoContrato(BuilderContrato builder) {this.builder = builder;}
    public void buildContrato(){
        this.builder.realizarContrato();
        this.builder.buildCosto();
        this.builder.buildEmpresa();
        this.builder.buildListaCanales();
    }
}
