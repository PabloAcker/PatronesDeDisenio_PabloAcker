package visitor.tarea1;

public class Bolivia implements IPais{

    @Override
    public void cambio(ILibreCambista libreCambista, int monto) {
        libreCambista.cambiarBillete(this,monto);
    }
}
