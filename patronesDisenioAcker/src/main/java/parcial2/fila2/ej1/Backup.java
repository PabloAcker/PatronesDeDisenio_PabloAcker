package segundoParcial.fila2.ej1;

public class Backup {

    private Archivo state;

    public Backup(Archivo archivo) {
        state = archivo;
    }

    public Archivo getArchivo() {
        return state;
    }


}
