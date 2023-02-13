package factoryMethod.tarea1;

public class Main {
    public static void main(String[] args) {

        PasajeStandard passStandard1 = new PasajeStandardCreator().create();
        PasajeStandard passStandard2 = new PasajeStandardCreator().create();

        PasajeSolidario passSoli1 = new PasajeSolidarioCreator().create();
        PasajeSolidario passSoli2 = new PasajeSolidarioCreator().create();

        PasajeInfantes passInfantes1 = new PasajeInfantesCreator().create();
        PasajeInfantes passInfantes2 = new PasajeInfantesCreator().create();

        System.out.println("---------Mostrando Pasajes----------");

        System.out.println("Pasajes Standard:...................");
        System.out.println("Primer pasaje>>>");
        passStandard1.getPasajero().setNombre("Julian");
        passStandard1.getPasajero().setCi(6720381);
        passStandard1.setNumeroAsiento(3);
        passStandard1.showInfoPasajes();
        System.out.println("Segundo pasaje>>>");
        passStandard2.getPasajero().setNombre("Dalex");
        passStandard2.getPasajero().setCi(64792011);
        passStandard2.setNumeroAsiento(300);
        passStandard2.showInfoPasajes();

        System.out.println("Pasajes Solidarios:..................");
        System.out.println("Primer pasaje>>>");
        passSoli1.getPasajero().setNombre("Sech");
        passSoli1.getPasajero().setCi(6891436);
        passSoli1.setNumeroAsiento(293);
        passSoli1.showInfoPasajes();
        System.out.println("Segundo pasaje>>>");
        passSoli2.getPasajero().setNombre("Feid");
        passSoli2.getPasajero().setCi(7894100);
        passSoli2.setNumeroAsiento(190);
        passSoli2.showInfoPasajes();

        System.out.println("Pasajes de Infantes:.................");
        System.out.println("Primer pasaje>>>");
        passInfantes1.getPasajero().setNombre("Lenny");
        passInfantes1.getPasajero().setCi(69416894);
        passInfantes1.setNumeroAsiento(296);
        passInfantes1.showInfoPasajes();
        System.out.println("Segundo pasaje>>>");
        passInfantes2.getPasajero().setNombre("Fabiana");
        passInfantes2.getPasajero().setCi(74164829);
        passInfantes2.setNumeroAsiento(1);
        passInfantes2.showInfoPasajes();

        System.out.println("------------------------------------");

    }
}
