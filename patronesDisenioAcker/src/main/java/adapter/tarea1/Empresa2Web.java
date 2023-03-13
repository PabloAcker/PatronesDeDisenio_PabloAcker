package adapter.tarea1;

public class Empresa2Web implements AplicacionWebEscritorio {
    private String nombrePagWeb;

    public Empresa2Web(String nombrePagWeb) {
        this.nombrePagWeb = nombrePagWeb;
    }

    public String getNombrePagWeb() {
        return nombrePagWeb;
    }

    public void setNombrePagWeb(String nombrePagWeb) {
        this.nombrePagWeb = nombrePagWeb;
    }

    @Override
    public void iniciarSesion() {
        System.out.println("Un nuevo usuario se ha registrado exitosamente en la siguiente pagina web: " + getNombrePagWeb());
    }

    @Override
    public void cerrarSesion() {
        System.out.println("El usuario ha cerrado cesion en la pagina: " + getNombrePagWeb());
    }

    @Override
    public void generacionDatos(String contenidoReporte) {
        System.out.println("El reporte con el siguiente texto se esta generando... \n" + contenidoReporte);
    }
}
