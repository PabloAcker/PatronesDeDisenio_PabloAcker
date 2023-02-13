package factoryMethod.tarea1;

public class PasajeStandard implements IAerolinea{
    private int numeroVuelo;
    private int numeroAsiento;
    private int costoPasaje;
    private Avion avion = new Avion();
    private Pasajero pasajero = new Pasajero();
    private Destino destino = new Destino();
    private Origen origen = new Origen();

    public PasajeStandard() {
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Origen getOrigen() {
        return origen;
    }

    public void setOrigen(Origen origen) {
        this.origen = origen;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public int getCostoPasaje() {
        return costoPasaje;
    }

    public void setCostoPasaje(int costoPasaje) {
        this.costoPasaje = costoPasaje;
    }

    @Override
    public void showInfoPasajes() {
        System.out.println("Mostrando Informacion de Pasajes:");
        System.out.println("Número de vuelo: " + getNumeroVuelo());
        System.out.println("Número de asiento: " + getNumeroAsiento());
        System.out.println("Costo de pasaje: " + getCostoPasaje());
        avion.showInfoAvion();
        pasajero.showInfoPasajero();
        destino.showInfoDestino();
        origen.showInfoOrigen();
    }
}
