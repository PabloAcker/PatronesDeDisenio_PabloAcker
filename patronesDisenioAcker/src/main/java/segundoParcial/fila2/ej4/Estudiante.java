package segundoParcial.fila2.ej4;

public class Estudiante {

    private String ci;
    private String nombre;
    private String fechaNacimiento;
    private String carrera;

    public Estudiante(String ci, String nombre, String fechaNacimiento, String carrera) {
        this.ci = ci;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.carrera = carrera;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void showInfo() {
        System.out.println("Mostrando informacion de Estudiante>>>>>>>>>>");
        System.out.println("Nombre: " +getNombre());
        System.out.println("CI: " +getCi());
        System.out.println("Fecha de Nacimiento: " + getFechaNacimiento());
        System.out.println("Carrera: " + getCarrera());

    }

}
