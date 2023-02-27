package parcial1.singgleton.a;

public class Peaje {
    private int monto;
    private static Peaje instance = null;

    public Peaje() {
        monto = 0;
        System.out.println("El monto inicial es: " + monto);
    }

    private synchronized static void multiThreadManage(){
        if (instance == null){
            instance = new Peaje();
        }
    }
    public static Peaje getInstance(){
        if (instance == null){
            multiThreadManage();
        }
        return instance;
    }
    public synchronized void registro(String placa, String modelo, String color){
        System.out.println("Iniciando Registro De Vehiculo>>>>");
        System.out.println("El auto con la placa: " + placa + ", " + modelo + " y " + color + " fue registrado exitosamente.");
    }
    public synchronized void dineroRecaudado(int dinero){
        System.out.println("******************************************");
        monto = monto+dinero;
        System.out.println("Pago realizado correctamente, dinero recaudado actual: " + monto);
    }
}
