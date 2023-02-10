package singleton.tarea1;

import java.io.*;

public class Logger {

    // attributo del mismo tipo
    private static Logger instance = null;
    private File file = new File("D:\\Intellij_IDEA\\IntelliJ_Projects\\Practicas_clase\\patronesDisenioAcker\\src\\main\\java\\singleton\\tarea1\\prueba.txt");
    private FileWriter write;

    // constructor privado
    private Logger() throws IOException {

        write = new FileWriter(file, true);
    }
    private synchronized static void create() throws IOException {
        if (instance == null)
            instance = new Logger();
    }

    // acceso global - metodo estatico publico que retorne la instancia unica

    public static Logger getInstance() throws IOException {
        if (instance == null)
            create();
        return instance;
    }

    public void registro (String message){
        System.out.println(message);
    }

    public void finish() throws IOException {
        write.close();
    }

}
