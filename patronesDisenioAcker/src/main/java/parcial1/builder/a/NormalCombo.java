package parcial1.builder.a;

public class NormalCombo extends BuilderCombo {
    @Override
    public void buildPipocas() {
        this.combo.setPipocas("Pipocas en envase normal");
    }

    @Override
    public void buildGaseosa() {
        this.combo.setGaseosas("1 refresco");
    }

    @Override
    public void buildChocolates() {
        this.combo.setChocolates("Sin chocolates :( ");
    }
}
