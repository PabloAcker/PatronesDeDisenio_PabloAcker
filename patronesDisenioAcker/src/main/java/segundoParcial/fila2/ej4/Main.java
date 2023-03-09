package segundoParcial.fila2.ej4;

public class Main {

    public static void main(String[] args) {

        BaseDatos baseDatos = new BaseDatos(new Estrategia2Nombre());

        Estudiante est1 = new Estudiante("1111111", "Ema", "3/2/2002", "Sistemas");
        Estudiante est2 = new Estudiante("2222222", "Enrique", "12/05/2001", "Derecho");
        Estudiante est3 = new Estudiante("3333333", "Hugo", "23/11/2002", "Comercial");
        Estudiante est4 = new Estudiante("4444444", "Eynar", "29/12/2001", "Admin");
        Estudiante est5 = new Estudiante("5555555", "Mateo", "30/04/2002", "Industrial");

        baseDatos.addEstudiantes(est1);
        baseDatos.addEstudiantes(est2);
        baseDatos.addEstudiantes(est3);
        baseDatos.addEstudiantes(est4);
        baseDatos.addEstudiantes(est5);

        System.out.println("Iniciando el ordenamiento por nombre>>>>>");
        baseDatos.ordenarListaEstudiantes();
        System.out.println("\n ====================================== \n");

        baseDatos.setOrdenar(new Estrategia1CI());
        System.out.println("Iniciando el ordenamiento por CI>>>>>");
        baseDatos.ordenarListaEstudiantes();
        System.out.println("\n ====================================== \n");

        System.out.println("Iniciando el ordenamiento por Carrera>>>>>");
        baseDatos.setOrdenar(new Estrategia3Carrera());
        baseDatos.ordenarListaEstudiantes();
        System.out.println("\n ====================================== \n");

    }


}
