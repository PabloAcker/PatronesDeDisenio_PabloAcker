package parcial1.builder.b;

public class ContratoAmazon extends BuilderContrato{
    @Override
    public void buildCosto() {this.contrato.setCosto("50 BS");}

    @Override
    public void buildEmpresa() {this.contrato.setEmpresa("AWS");}

    @Override
    public void buildListaCanales() {this.contrato.setListaCanales("Green Arrow, Dc Legends, Batman");}

}
