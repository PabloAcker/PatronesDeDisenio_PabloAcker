package segundoParcial.fila2.ej1;

public class Versionador {

    private Archivo archivo;

    public void setArchivo(Archivo archivo) {

        if(archivo.getNuevaOracion().split(" ").length >=5) {
            this.archivo = archivo;
            System.out.println("Backup guardado!");

        } else {
            System.out.println("La oracion no contiene mas de 5 palabras, no se pudo guardar :(");

        }
    }

    public Backup createBackupArchivo() {
        return new Backup(archivo);
    }

    public Archivo restoreArchivo(Backup backup) {
        this.archivo = backup.getArchivo();
        return this.archivo;

    }

}
