package singleton.practicaClaseCasaCambios;

public class CasaCambios {
    private int monto;
    public CasaCambios(int monto) {
        this.monto = monto;
    }
    public void CambiarMonedaDolarABs(){
        EmpresaCambioMonedas.getInstance().cambiarDolarABs(monto);
    }
    public void CambiarMonedaEuroABs(){
        EmpresaCambioMonedas.getInstance().cambiarEuroABs(monto);
    }
    public void cambiarMonedaBsADolar(){
        EmpresaCambioMonedas.getInstance().cambiarBsADolar(monto);
    }
    public void cambiarMonedaBsAEuro(){
        EmpresaCambioMonedas.getInstance().cambiarBsAEuro(monto);
    }
    public void cambiarMonedaEuroADolar(){
        EmpresaCambioMonedas.getInstance().cambiarEuroADolar(monto);
    }

    public void cambiarMonedaDolarAEuro(){
        EmpresaCambioMonedas.getInstance().cambiarDolarAEuro(monto);
    }
}
