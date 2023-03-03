package observer.tarea1;

public class Main {
    public static void main(String[] args) {

        CompaniaTelf companiaTelf = new CompaniaTelf();
        companiaTelf.setNombreInstitucional("Tigo");
        companiaTelf.setSlogang("Estamos siempre conTigo!");

        Cliente cliente1 = new Cliente("Pedro", "76491493");
        Cliente cliente2 = new Cliente("Maria", "64914697");
        Cliente cliente3 = new Cliente("Eynar", "64191242");

        companiaTelf.asociamiento(cliente1,"premios");
        companiaTelf.asociamiento(cliente1,"promociones");

        companiaTelf.asociamiento(cliente2,"noticias");

        companiaTelf.asociamiento(cliente3,"precios de llamadas");
        companiaTelf.asociamiento(cliente3,"promociones");
        companiaTelf.asociamiento(cliente3,"premios");
        companiaTelf.asociamiento(cliente3,"noticias");

        companiaTelf.setPropaganda(new Propaganda("324FAK23", "premios"));
        companiaTelf.setPropaganda(new Propaganda("6491219FKSGA", "noticias"));
    }
}
