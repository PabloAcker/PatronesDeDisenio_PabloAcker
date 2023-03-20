package Composite.tarea1;
import java.util.ArrayList;
import java.util.List;

public class Laboratorio extends ContenedorCompus{
    private List<ContenedorCompus> contenedortList = new ArrayList<>();
    int precioTotal = 0;

    public Laboratorio(int precio){
        super(precio);
    }
    @Override
    public void showInfo() {
        for(ContenedorCompus contenedor : contenedortList){
            contenedor.showInfo();
            precioTotal = precioTotal+contenedor.getPrecio();
        }
        System.out.println("Precio total: " + precioTotal + " $");
    }
    @Override
    public void add(ContenedorCompus contenedorCompus) {
        contenedortList.add(contenedorCompus);
    }
    @Override
    public void remove(ContenedorCompus contenedorCompus) {
        contenedortList.remove(contenedorCompus);
    }
}
