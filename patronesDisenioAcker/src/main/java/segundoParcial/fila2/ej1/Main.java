package segundoParcial.fila2.ej1;

public class Main {

    public static void main(String[] args) {

        Versionador versionador = new Versionador();
        Almacenamiento almacenamiento = new Almacenamiento();

        Archivo archivo;

        archivo = new Archivo("111111","este documento es una prueba \n","este documento es una prueba \n");
        versionador.setArchivo(archivo);
        almacenamiento.addBackup("version1", versionador.createBackupArchivo());

        archivo = new Archivo(archivo.getId(), archivo.getOracion() + "el exito solo depende de tu esfuerzo \n","el exito solo depende de tu esfuerzo \n");
        versionador.setArchivo(archivo);
        almacenamiento.addBackup("version2", versionador.createBackupArchivo());

        archivo = new Archivo(archivo.getId(), archivo.getOracion() + "prologo \n","prologo \n");
        versionador.setArchivo(archivo);

        archivo = new Archivo(archivo.getId(), archivo.getOracion() + "este documento fue actualizado satisfactoriamente \n","este documento fue actualizado satisfactoriamente \n");
        versionador.setArchivo(archivo);
        almacenamiento.addBackup("version3", versionador.createBackupArchivo());

        archivo.showInfo();

        System.out.println("Restaurando los archivos...");

        archivo = versionador.restoreArchivo(almacenamiento.getBackup("version1"));

        archivo.showInfo();
    }

}
