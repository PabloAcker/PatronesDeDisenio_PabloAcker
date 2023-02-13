package factoryMethod.tarea1;

public class PasajeSolidario implements IAerolinea {
    private int numeroVuelo;
    private int numeroAsiento;
    private int costoPasaje;
    private int descuento;
    private String motivoDescuento;
    private Avion avion = new Avion();
    private Pasajero pasajero = new Pasajero();
    private Destino destino = new Destino();
    private Origen origen = new Origen();

    public PasajeSolidario() {}

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
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

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public String getMotivoDescuento() {
        return motivoDescuento;
    }

    public void setMotivoDescuento(String motivoDescuento) {
        this.motivoDescuento = motivoDescuento;
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

    @Override
    public void showInfoPasajes() {
        System.out.println("Mostrando Informacion de Pasajes:");
        System.out.println("Número de vuelo: " + getNumeroVuelo());
        System.out.println("Número de asiento: " + getNumeroAsiento());
        System.out.println("Costo de pasaje: " + getCostoPasaje());
        System.out.println("Decuento: " + getDescuento());
        System.out.println("Motivo del descuento: " + getMotivoDescuento());
        avion.showInfoAvion();
        pasajero.showInfoPasajero();
        destino.showInfoDestino();
        origen.showInfoOrigen();
    }
}
