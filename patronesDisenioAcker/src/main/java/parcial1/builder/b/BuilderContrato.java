package parcial1.builder.b;

public abstract class BuilderContrato {
    protected Contrato contrato;
    public Contrato getContrato(){return contrato;}
    public void realizarContrato(){contrato = new Contrato();}
    public abstract void buildCosto();
    public abstract void buildEmpresa();
    public abstract void buildListaCanales();
}
