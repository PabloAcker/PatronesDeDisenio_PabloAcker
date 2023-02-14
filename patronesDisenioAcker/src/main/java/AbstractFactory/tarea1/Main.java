package AbstractFactory.tarea1;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------------------------------------");

        System.out.println("Pasajes Standard >>>>>");

        String pasajeStandard1 = "PasajeStandard1";
        String pasajeStandard2 = "PasajeStandard2";
        FactoryPasajes.make(pasajeStandard1).showInfoPasaje();
        FactoryPasajes.make(pasajeStandard2).showInfoPasaje();

        System.out.println("Pasajes Solidarios >>>>>");

        String pasajeSolidario1 = "PasajeSolidario1";
        String pasajeSolidario2 = "PasajeSolidario2";
        FactoryPasajes.make(pasajeSolidario1).showInfoPasaje();
        FactoryPasajes.make(pasajeSolidario2).showInfoPasaje();

        System.out.println("Pasajes de Infantes >>>>>");

        String pasajeInfante1 = "PasajeInfantes1";
        String pasajeInfante2 = "PasajeInfantes2";
        FactoryPasajes.make(pasajeInfante1).showInfoPasaje();
        FactoryPasajes.make(pasajeInfante2).showInfoPasaje();


        System.out.println("---------------------------------------");
    }

}
