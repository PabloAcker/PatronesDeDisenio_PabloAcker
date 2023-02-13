package factoryMethod.tarea1;

public class PasajeInfantesCreator extends PasajeCreator {
    @Override
    public PasajeInfantes create() {
        PasajeInfantes passInfantes = new PasajeInfantes();
        passInfantes.setNumeroVuelo(320);
        passInfantes.setNumeroAsiento(2);
        passInfantes.setCostoEspecial(500);

        Avion avion = new Avion();
        avion.setMarca("Qatar");
        avion.setCapacidad("600 pasajeros");
        avion.setModelo("Airbus 3000");
        avion.setNumeroAsientos("550 asientos");

        Pasajero pasajero = new Pasajero();
        pasajero.setNombre("Adrian");
        pasajero.setCi(6729462);

        Destino destino = new Destino();
        destino.setPais("Colombia");
        destino.setCiudad("Bogota");
        destino.setAeropuerto("Dorado");

        Origen origen = new Origen();
        origen.setPais("Arabia");
        origen.setCiudad("Qatar");
        origen.setAeropuerto("Aeropuerto Internacional de Qatar");

        passInfantes.setAvion(avion);
        passInfantes.setPasajero(pasajero);
        passInfantes.setDestino(destino);
        passInfantes.setOrigen(origen);

        return passInfantes;
    }
}
