package AbstractFactory.tarea1;

public class PasajeInfantes extends Pasajes {
    private int numeroVuelo;
    private int numeroAsiento;
    private int costoEspecial;
    private Avion avion = new Avion("Nedforce 69", "200 pasajeros", "Airbus 300", "170 asientos");
    private Pasajero pasajero = new Pasajero("Ema",9641944);
    private Destino destino = new Destino("Bolivia", "Santa Cruz", "Viru Viru");
    private Origen origen = new Origen("Bolivia","La Paz", "Aeropuerto Internacional El Alto");

    public PasajeInfantes() {}

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

    public int getCostoEspecial() {
        return costoEspecial;
    }

    public void setCostoEspecial(int costoEspecial) {
        this.costoEspecial = costoEspecial;
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
    public void showInfoPasaje() {
        System.out.println("**************************************************");
        System.out.println(" ");
        System.out.println("Mostrando Informacion del Pasaje Infante:");
        System.out.println("Número de vuelo: " + getNumeroVuelo());
        System.out.println("Número de asiento: " + getNumeroAsiento());
        System.out.println("Costo especial: " + getCostoEspecial());
        avion.showInfoAvion();
        pasajero.showInfoPasajero();
        destino.showInfoDestino();
        origen.showInfoOrigen();
        System.out.println(" ");
    }
}
