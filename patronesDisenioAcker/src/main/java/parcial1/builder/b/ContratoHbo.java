package parcial1.builder.b;

public class ContratoHbo extends BuilderContrato{
    @Override
    public void buildCosto() {this.contrato.setCosto("100 BS");}

    @Override
    public void buildEmpresa() {this.contrato.setEmpresa("HBO");}

    @Override
    public void buildListaCanales() {this.contrato.setListaCanales("How I meet your mother, Titans, Flash");}
}
