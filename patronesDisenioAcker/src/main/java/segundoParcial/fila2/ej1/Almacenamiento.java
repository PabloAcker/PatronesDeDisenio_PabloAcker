package segundoParcial.fila2.ej1;

import java.util.HashMap;
import java.util.Map;

public class Almacenamiento {

    private Map<String, Backup> archivos = new HashMap<>();

    public void addBackup(String idBackup, Backup backup) {
        archivos.put(idBackup, backup);

    }

    public Backup getBackup(String id) {
        return archivos.get(id);
    }


}
