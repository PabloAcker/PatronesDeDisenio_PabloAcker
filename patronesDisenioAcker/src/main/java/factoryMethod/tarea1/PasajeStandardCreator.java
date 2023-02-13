package factoryMethod.tarea1;

public class PasajeStandardCreator extends PasajeCreator {

    @Override
    public PasajeStandard create() {
        PasajeStandard passStandard = new PasajeStandard();
        passStandard.setNumeroVuelo(610);
        passStandard.setNumeroAsiento(23);
        passStandard.setCostoPasaje(70);

        Avion avion = new Avion();
        avion.setMarca("BOA");
        avion.setCapacidad("200 pasajeros");
        avion.setModelo("Airbus 300");
        avion.setNumeroAsientos("170 asientos");

        Pasajero pasajero = new Pasajero();
        pasajero.setNombre("Pablo");
        pasajero.setCi(6724142);

        Destino destino = new Destino();
        destino.setPais("Bolivia");
        destino.setCiudad("Santa Cruz");
        destino.setAeropuerto("Viru Viru");

        Origen origen = new Origen();
        origen.setPais("Bolivia");
        origen.setCiudad("La Paz");
        origen.setAeropuerto("Aeropuerto Internacional El Alto");

        passStandard.setAvion(avion);
        passStandard.setPasajero(pasajero);
        passStandard.setDestino(destino);
        passStandard.setOrigen(origen);

        return passStandard;
    }
}
