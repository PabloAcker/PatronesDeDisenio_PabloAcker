package Composite.tarea1;
import java.util.ArrayList;
import java.util.List;

public class Laboratorio extends ContenedorCompus{
    private List<ContenedorCompus> contenedortList = new ArrayList<>();

    public Laboratorio(String tipo){
        super(tipo);
    }
    @Override
    public String showInfo() {
        return getTipo() +" tiene un precio total de >>> \n" + " Precio: " + getPrecio() + "\n";
    }

    @Override
    public void calcularPrecio() {
        for(ContenedorCompus contenedorCompus : contenedortList) {
            contenedorCompus.calcularPrecio();
            this.setPrecio(this.getPrecio() + contenedorCompus.getPrecio());
        }
        Singleton.getInstance().add(this.showInfo());
        if(isUltimo()) {
            Singleton.getInstance().showInfo();
            Singleton.getInstance().setPrecioGlobal(Singleton.getInstance().getPrecioGlobal() + this.getPrecio());
        }
    }

    @Override
    public void add(ContenedorCompus contenedorCompus) {
        contenedortList.add(contenedorCompus);
    }
    @Override
    public void remove(ContenedorCompus contenedorCompus) {
        contenedorCompus.remove(contenedorCompus);
    }

}
