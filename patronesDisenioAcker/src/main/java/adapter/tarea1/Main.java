package adapter.tarea1;

public class Main {
    public static void main(String[] args) {
        Empresa1Movil empresa1Movil = new Empresa1Movil("Android");

        Empresa2Web empresa2Web = new Empresa2Web("PaginaUltraCool.com");
        empresa2Web.iniciarSesion();

        System.out.println("====================================================");

        Empresa1Web empresa1Web = new Empresa1Web(empresa1Movil);
        empresa1Web.iniciarSesion();

        System.out.println("====================================================");

        empresa1Web.generacionDatos("Implementando un reporte para nuestra aplicacion!");
        System.out.println("====================================================");
        empresa2Web.generacionDatos("Iniciando un reporte muy largo y aburrido para la pagina web...");

        System.out.println("====================================================");
        empresa1Web.cerrarSesion();
        System.out.println("====================================================");
        empresa2Web.cerrarSesion();
        System.out.println("====================================================");
    }
}
