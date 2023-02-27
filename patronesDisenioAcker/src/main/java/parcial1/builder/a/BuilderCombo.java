package parcial1.builder.a;

public abstract class BuilderCombo {
    protected Combo combo;

    public Combo getCombo(){
        return combo;
    }

    public void prepararCombo(){
        combo = new Combo();
    }

    public abstract void buildPipocas();
    public abstract void buildGaseosa();
    public abstract void buildChocolates();
}
