package proxy.tarea1;

public class Transaccion {
    private int monto;
    private String moneda;

    public Transaccion(int monto, String moneda) {
        this.monto = monto;
        this.moneda = moneda;
    }

    public int getMonto() {
        return monto;
    }

    public String getMoneda() {
        return moneda;
    }

    public void showInfo(){
        System.out.println("La transaccion realizada fue por un monto de: " + getMonto() + " y con el tipo de moneda: " + getMoneda());
    }
}
