package ChainOfResponsability.tarea1;

public class Main {
    public static void main(String[] args) {

        AplicacionUsada app = new AplicacionUsada();

        //app.reporteProblema(new Cliente("Ema", "7372010"), "Bug menor", "baja", "un error comun");
        //app.reporteProblema(new Cliente("Lagu", "64829164"), "Error de servidores", "media", "No se pudo conectar con los servidores");
        app.reporteProblema(new Cliente("Rotis", "4619469"), "Error de graficos", "alta", "No existen los graficos necesarios");
        //app.reporteProblema(new Cliente("Rene", "64891641"), "Error de drivers", "critica", "No se encontraron los drivers necesarios");

    }
}
