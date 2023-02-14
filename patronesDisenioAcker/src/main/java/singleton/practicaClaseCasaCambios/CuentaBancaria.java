package singleton.practicaClaseCasaCambios;

public class CuentaBancaria {
    public int saldo;
    private static CuentaBancaria instance = null;

    private CuentaBancaria() {
        saldo = 20000;
    }

    private synchronized static void multiThreadManage(){
        if (instance == null){
            instance = new CuentaBancaria();
        }
    }
    public static CuentaBancaria getInstance(){
        if (instance == null){
            multiThreadManage();
        }
        return instance;
    }
    public synchronized void guardarCambios(int dolar, int euro){
        EmpresaCambioMonedas.getInstance().cambiarDolarABs(dolar);
        EmpresaCambioMonedas.getInstance().cambiarEuroABs(euro);
    }
}
