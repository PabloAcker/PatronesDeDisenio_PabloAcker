package adapter.tarea1;

public class Empresa1Movil implements AplicacionMovil{
    private String name;

    public Empresa1Movil(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void login() {
        System.out.println("Un nuevo usuario se ha registrado exitosamente en la empresa: " + getName());
    }

    @Override
    public void logout() {
        System.out.println("El usuario ha cerrado cesion");

    }

    @Override
    public void reporte(String contenidoReporte) {
        System.out.println("El reporte con el siguiente texto se esta generando... \n" + contenidoReporte);
    }
}
