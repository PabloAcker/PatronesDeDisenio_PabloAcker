package visitor.tarea1;

public class EEUU implements IPais{
    @Override
    public void cambio(ILibreCambista libreCambista, int monto) {
        libreCambista.cambiarBillete(this,monto);
    }
}
