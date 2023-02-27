package parcial1.builder.b;

public class ContratoNetflix extends BuilderContrato{
    @Override
    public void buildCosto() {this.contrato.setCosto("150 BS");}

    @Override
    public void buildEmpresa() {this.contrato.setEmpresa("Netflix");}

    @Override
    public void buildListaCanales() {this.contrato.setListaCanales("The Walking Dead, The witcher, Stranger Things");}
}
