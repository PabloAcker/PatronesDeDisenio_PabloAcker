package singleton.practicaClaseCasaCambios;

public class Main {
    public static void main(String[] args) {

        System.out.println("Mostrando cambios de dinero>>>");

        System.out.println("Cambios en Libre Cambista:");
        LibreCambistas libreCambista = new LibreCambistas(10);
        libreCambista.cambiarMonedaBsADolar();
        libreCambista.cambiarMonedaBsAEuro();
        libreCambista.CambiarMonedaDolarABs();
        libreCambista.cambiarMonedaDolarAEuro();
        libreCambista.cambiarMonedaEuroADolar();
        libreCambista.CambiarMonedaEuroABs();

        System.out.println("Cambios en Casa de Cambios:");
        CasaCambios casaCambio = new CasaCambios(20);
        casaCambio.cambiarMonedaBsADolar();
        casaCambio.cambiarMonedaBsAEuro();
        casaCambio.CambiarMonedaDolarABs();
        casaCambio.cambiarMonedaDolarAEuro();
        casaCambio.cambiarMonedaEuroADolar();
        casaCambio.CambiarMonedaEuroABs();

        System.out.println("Cambios en el banco:");
        Banco banco = new Banco(30);
        banco.cambiarMonedaBsADolar();
        banco.cambiarMonedaBsAEuro();
        banco.CambiarMonedaDolarABs();
        banco.cambiarMonedaDolarAEuro();
        banco.cambiarMonedaEuroADolar();
        banco.CambiarMonedaEuroABs();

        System.out.println("Mostrando los cambios a bolivianos:");
        CuentaBancaria.getInstance().guardarCambios(100,50);
    }
}
