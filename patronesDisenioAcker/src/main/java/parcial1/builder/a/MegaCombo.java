package parcial1.builder.a;

public class MegaCombo extends BuilderCombo {
    @Override
    public void buildPipocas() {
        this.combo.setPipocas("Extra Grandes");
    }

    @Override
    public void buildGaseosa() {
        this.combo.setGaseosas("3 vasos de gaseosas extragrandes con recarga ilimitada");
    }

    @Override
    public void buildChocolates() {
        this.combo.setChocolates("2 chocolates grandes");
    }
}
