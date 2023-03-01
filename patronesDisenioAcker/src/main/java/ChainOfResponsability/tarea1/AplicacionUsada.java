package ChainOfResponsability.tarea1;

public class AplicacionUsada implements IHandler{
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void reporteProblema(Cliente cliente, String titulo, String severidad, String descripcion) {
        EquipoSoporte eS = new EquipoSoporte();
        PO po = new PO();
        QA qa = new QA();
        Dev dev = new Dev();

        this.setNext(eS);
        eS.setNext(po);
        po.setNext(qa);
        qa.setNext(dev);

        this.next.reporteProblema(cliente, titulo, severidad, descripcion);
    }
}
