package proxy.tarea1;

public class Tarjeta implements ICuenta{
    private Cuenta cuenta;

    public Tarjeta() {
        System.out.println("Su cuenta nueva actualmente tiene 400 bs>>>>>");
        cuenta = new Cuenta(400);
    }

    @Override
    public void realizarTransaccion(Transaccion transaccion) {
        if(transaccion.getMoneda().equals("bolivianos") && transaccion.getMonto()<= cuenta.getSaldo()){
            cuenta.realizarTransaccion(transaccion);
        } else if(transaccion.getMonto()> cuenta.getSaldo()){
            System.out.println("ERROR>>> Saldo insuficiente :( ");
        } else {
            cuenta.realizarTransaccion(cuenta.cambiarABolivianos(transaccion));
        }
    }
}
