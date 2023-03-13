package proxy.tarea1;

public class Cuenta implements ICuenta{
    int saldo;

    public Cuenta(int saldo){
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    @Override
    public void realizarTransaccion(Transaccion transaccion) {
        transaccion.showInfo();
        saldo = saldo - transaccion.getMonto();
        System.out.println("El saldo actual es de " + getSaldo() + " Bs");
    }

    public Transaccion cambiarABolivianos(Transaccion transaccion) {
        if(transaccion.getMoneda().equals("dolares")){
            System.out.println("Cambiando dolares a bolivianos...");
            return new Transaccion(transaccion.getMonto() * 7, "bolivianos");
        } else if(transaccion.getMoneda().equals("euros")) {
            System.out.println("Cambiando euros a bolivianos...");
            return new Transaccion(transaccion.getMonto() * 8, "bolivianos");
        } else {
            System.out.println("Moneda no registrada en el banco, intente de nuevo...");
            return new Transaccion(0, "bolivianos");
        }
    }
}
