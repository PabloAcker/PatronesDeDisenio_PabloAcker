package bridge.tarea1;

public class Windows implements IPlataforma{
    private IArquitectura arquitectura;

    public Windows(IArquitectura arquitectura) {
        this.arquitectura = arquitectura;
    }

    public IArquitectura getArquitectura() {
        return arquitectura;
    }

    public void setArquitectura(IArquitectura arquitectura) {
        this.arquitectura = arquitectura;
    }

    @Override
    public void ejecutarArquitectura() {
        System.out.println("Ejecutando la siguiente arquitectura en Windows...");
        this.arquitectura.ejecutarArquitectura();
        System.out.println("=================================================");
    }
}
