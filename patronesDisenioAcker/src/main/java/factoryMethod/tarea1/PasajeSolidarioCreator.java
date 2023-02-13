package factoryMethod.tarea1;

public class PasajeSolidarioCreator extends PasajeCreator {
    @Override
    public PasajeSolidario create() {
        PasajeSolidario passSolidario = new PasajeSolidario();
        passSolidario.setNumeroVuelo(720);
        passSolidario.setNumeroAsiento(70);
        passSolidario.setCostoPasaje(320);
        passSolidario.setDescuento(30);
        passSolidario.setMotivoDescuento("Economia");

        Avion avion = new Avion();
        avion.setMarca("Avianca");
        avion.setCapacidad("500 pasajeros");
        avion.setModelo("Airbus 270");
        avion.setNumeroAsientos("400 asientos");

        Pasajero pasajero = new Pasajero();
        pasajero.setNombre("Mauricio");
        pasajero.setCi(6726290);

        Destino destino = new Destino();
        destino.setPais("Bolivia");
        destino.setCiudad("Cochabamba");
        destino.setAeropuerto("Jorge Wilstermann");

        Origen origen = new Origen();
        origen.setPais("Bolivia");
        origen.setCiudad("La Paz");
        origen.setAeropuerto("Aeropuerto Internacional El Alto");

        passSolidario.setAvion(avion);
        passSolidario.setPasajero(pasajero);
        passSolidario.setDestino(destino);
        passSolidario.setOrigen(origen);

        return passSolidario;
    }
}
