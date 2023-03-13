package adapter.tarea1;

public class Empresa1Web implements AplicacionWebEscritorio {
    private Empresa1Movil empresa1Movil;

    public Empresa1Web(Empresa1Movil empresa1Movil) {
        this.empresa1Movil = empresa1Movil;
    }

    @Override
    public void iniciarSesion() {
        empresa1Movil.login();
    }

    @Override
    public void cerrarSesion() {
        empresa1Movil.logout();
    }

    @Override
    public void generacionDatos(String contenidoReporte) {
        empresa1Movil.reporte(contenidoReporte);
    }

}
