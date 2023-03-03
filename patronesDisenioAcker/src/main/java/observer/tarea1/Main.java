package observer.tarea1;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        CompaniaTelf companiaTelf = new CompaniaTelf();
        companiaTelf.setNombreInstitucional("Tigo");
        companiaTelf.setSlogang("Estamos siempre conTigo!");

        Cliente cliente1 = new Cliente("Pedro", "76491493");
        Cliente cliente2 = new Cliente("Maria", "64914697");
        Cliente cliente3 = new Cliente("Eynar", "64191242");

        companiaTelf.asociamiento(cliente1,List.of("premios","promociones"));

        companiaTelf.asociamiento(cliente2,List.of("noticias"));

        companiaTelf.asociamiento(cliente3,List.of("precios de llamadas", "promociones", "premios" , "noticias"));

        //companiaTelf.setPropaganda(new Propaganda("324FAK23", "premios"));
        companiaTelf.setPropaganda(new Propaganda("6491219FKSGA", "noticias"));
    }
}
