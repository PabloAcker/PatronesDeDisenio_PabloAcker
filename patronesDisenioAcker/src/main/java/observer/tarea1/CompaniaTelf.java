package observer.tarea1;
import java.util.ArrayList;
import java.util.List;
public class CompaniaTelf implements ICompaniaTelf{
    private String nombreInstitucional;
    private String slogang;
    private List<ICliente> clientList = new ArrayList<>();
    private List<Propaganda> propagandaList = new ArrayList<>();

    public String getNombreInstitucional() {
        return nombreInstitucional;
    }

    public void setNombreInstitucional(String nombreInstitucional) {
        this.nombreInstitucional = nombreInstitucional;
    }

    public String getSlogang() {
        return slogang;
    }

    public void setSlogang(String slogang) {
        this.slogang = slogang;
    }

    public List<Propaganda> getPropagandaList() {
        return propagandaList;
    }

    public void setPropaganda(Propaganda newPropaganda) {
        this.propagandaList.add(newPropaganda);
        this.notificacion(newPropaganda);
    }

    @Override
    public void asociamiento(ICliente cliente, String categoria) {
        cliente.setCategoriaPropaganda(categoria);
        clientList.add(cliente);
    }

    @Override
    public void removeAsociamiento(ICliente cliente) {
        clientList.remove(cliente);
    }

    @Override
    public void notificacion(Propaganda propaganda) {
        for (ICliente cliente:clientList) {
            if (propaganda.getCategoria().equals(cliente.getCategoriaPropaganda()))
                cliente.subirNotificacion("Le llegó una notificacion de su compañía telefónica hablando sobre bla bla bla....: \n",propaganda);
        }
    }
}
