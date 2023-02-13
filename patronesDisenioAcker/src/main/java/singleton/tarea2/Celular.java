package singleton.tarea2;

public class Celular {

    private String modelo;
    private String tamano;
    private String cpu;
    private Sim sim;
    private String versionAndroid;
    private String camara;
    private String bluetooth;
    private int cantidadMemoriaExterna;
    private String tiempoUsoBateria;
    private String accesorios;

    public Celular(String modelo, String tamano, String cpu, String versionAndroid, String camara, String bluetooth, int cantidadMemoriaExterna, String tiempoUsoBateria, String accesorios) {
        this.modelo = modelo;
        this.tamano = tamano;
        this.cpu = cpu;
        this.versionAndroid = versionAndroid;
        this.camara = camara;
        this.bluetooth = bluetooth;
        this.cantidadMemoriaExterna = cantidadMemoriaExterna;
        this.tiempoUsoBateria = tiempoUsoBateria;
        this.accesorios = accesorios;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Sim getSim() {
        return sim;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }

    public String getVersionAndroid() {
        return versionAndroid;
    }

    public void setVersionAndroid(String versionAndroid) {
        this.versionAndroid = versionAndroid;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

    public int getCantidadMemoriaExterna() {
        return cantidadMemoriaExterna;
    }

    public void setCantidadMemoriaExterna(int cantidadMemoriaExterna) {
        this.cantidadMemoriaExterna = cantidadMemoriaExterna;
    }

    public String getTiempoUsoBateria() {
        return tiempoUsoBateria;
    }

    public void setTiempoUsoBateria(String tiempoUsoBateria) {
        this.tiempoUsoBateria = tiempoUsoBateria;
    }

    public String getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(String accesorios) {
        this.accesorios = accesorios;
    }

    @Override
    public Celular clone() {
        Celular clone = new Celular(this.modelo,this.tamano,this.cpu,
                this.versionAndroid,this.camara,this.bluetooth,this.cantidadMemoriaExterna,
                this.tiempoUsoBateria,this.accesorios);
        clone.setBluetooth(this.getBluetooth());
        clone.setCamara(this.getCamara());
        clone.setCpu(this.getCpu());
        clone.setTamano(this.getTamano());
        clone.setTiempoUsoBateria(this.getTiempoUsoBateria());
        clone.setCantidadMemoriaExterna(this.getCantidadMemoriaExterna());
        clone.setAccesorios(this.getAccesorios());
        clone.setSim(this.getSim());
        return clone;
    }

    public void showInfo() {
        System.out.print("\n ----------------  \n");
        System.out.println("Modelo celular: "+this.getModelo());
        System.out.println("Tamaño celular: "+this.getTamano());
        System.out.println("CPU " + this.getCpu());
        System.out.println("Versión de Android " + this.getVersionAndroid());
        System.out.println("Cámara " + this.getCamara());
        System.out.println("Bluetooth "+this.getBluetooth());
        System.out.println("Cantidad de Memoria Externas "+ this.getCantidadMemoriaExterna());
        System.out.println("Tiempo de vida de bateria "+ this.getTiempoUsoBateria());
        System.out.println("Accesorios "+ this.getAccesorios());
        getSim().showInfo();
    }
}
