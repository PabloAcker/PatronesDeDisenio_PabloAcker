package parcial1.builder.a;

public class MedianoCombo extends BuilderCombo {
    @Override
    public void buildPipocas() {
        this.combo.setPipocas("Pipocas grandes");
    }

    @Override
    public void buildGaseosa() {
        this.combo.setGaseosas("2 vasos de refrescos");
    }

    @Override
    public void buildChocolates() {
        this.combo.setChocolates("1 chocolate");
    }
}
