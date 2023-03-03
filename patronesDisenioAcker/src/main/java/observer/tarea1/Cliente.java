package observer.tarea1;

public class Cliente implements ICliente{
    private String nombre;
    private String ci;
    private String categoria;

    public Cliente(String nombre, String ci) {
        this.nombre = nombre;
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    @Override
    public void subirNotificacion(String message, Propaganda propaganda) {
        System.out.println("Iniciando espacio publicitario>>>>>>");
        System.out.println("Para el cliente con el nombre: "+getNombre());
        System.out.println("Con CI: "+getCi());
        System.out.println("se muestra la categoria a su eleccion: "+getCategoriaPropaganda());
        System.out.println(message);
        propaganda.showInfoPropaganda();
        System.out.println("=======================================");
    }

    @Override
    public void setCategoriaPropaganda(String categoria) {
        this.categoria=categoria;
    }

    @Override
    public String getCategoriaPropaganda() {
        return categoria;
    }
}
