package parcial1.singgleton.b;

import java.util.Date;

public class AlmacenTesis {
    private int registro;
    private static AlmacenTesis instance = null;

    public AlmacenTesis() {
        registro = 0;
    }
    private synchronized static void multiThreadManage(){
        if (instance == null){
            instance = new AlmacenTesis();
        }
    }
    public static AlmacenTesis getInstance(){
        if (instance == null){
            multiThreadManage();
        }
        return instance;
    }
    public synchronized void inscribirTesis(TemaTesis temaTesis){
        System.out.println("********TESIS REGISTRADA************");
        Date date = new Date();
        System.out.println("Tesis registrada exitosamente: "+temaTesis.getTitulo());
        System.out.println("Registro: "+date);
        registro = registro+1;
    }
    public void cantidadRegistros(){
        System.out.println("************** #REGISTROS ************");
        System.out.println("Tesis resgistradas: "+registro);
    }
}
