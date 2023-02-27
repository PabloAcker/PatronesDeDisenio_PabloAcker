package parcial1.builder.b;

public class LaunchContrato {
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma();
        ContratoNetflix netflix = new ContratoNetflix();
        ContratoHbo hbo = new ContratoHbo();
        ContratoAmazon amazon = new ContratoAmazon();

        plataforma.setTipoContrato(netflix);
        plataforma.buildContrato();

        Contrato contrato = plataforma.getContrato();
        System.out.println("Mostrando informacion de NETFLIX");
        contrato.showContrato();

        plataforma.setTipoContrato(hbo);
        plataforma.buildContrato();

        Contrato contrato2 = plataforma.getContrato();
        System.out.println("Mostrando informacion de HBO");
        contrato2.showContrato();

        plataforma.setTipoContrato(amazon);
        plataforma.buildContrato();

        Contrato contrato3 = plataforma.getContrato();
        System.out.println("Mostrando informacion de Amazon");
        contrato3.showContrato();
    }
}
