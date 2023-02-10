package singleton.tarea2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class example {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream os = new FileOutputStream("nombre_archivo_ejemplo.txt");
        PrintStream ps = new PrintStream(os);
        ps.println("prueba de impresión realizada");

        //System.out.println("Hello World!");
    }
}
