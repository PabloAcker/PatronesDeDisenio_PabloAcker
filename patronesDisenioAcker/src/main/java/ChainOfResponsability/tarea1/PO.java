package ChainOfResponsability.tarea1;

public class PO implements IHandler{
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
        if (severidad.equals("media")){
            System.out.println("EL PO pudo arreglar el siguiente problema: "+titulo+", con severidad: "+severidad+" y con descripcion: "+descripcion);
            System.out.println("Se le resolvio el problema al cliente con los datos: ");
            cliente.showInfoCLiente();
        } else {
            System.out.println("El PO no pudo arreglar el problema "+titulo+", con la severidad: "+severidad+" y con la descripcion: "+descripcion+". Se lo pasa a revision al siguiente nivel superior...");
            next.reporteProblema(cliente, titulo, severidad, descripcion);
        }
    }
}
