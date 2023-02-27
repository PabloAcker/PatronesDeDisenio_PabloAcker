package parcial1.prototype.a;

public class Televisor implements ITelevisor {
    private String sistemaOperativo;
    private String versionSistemaOperativo;
    private int pulgadas;
    private int resolucion ;
    private boolean hdmi;
    private int puertosUsb;
    private boolean controlRemoto;
    private boolean bluetooth;
    private String serial;

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getVersionSistemaOperativo() {
        return versionSistemaOperativo;
    }

    public void setVersionSistemaOperativo(String versionSistemaOperativo) {
        this.versionSistemaOperativo = versionSistemaOperativo;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isHdmi() {
        return hdmi;
    }

    public void setHdmi(boolean hdmi) {
        this.hdmi = hdmi;
    }

    public int getPuertosUsb() {
        return puertosUsb;
    }

    public void setPuertosUsb(int puertosUsb) {
        this.puertosUsb = puertosUsb;
    }

    public boolean isControlRemoto() {
        return controlRemoto;
    }

    public void setControlRemoto(boolean controlRemoto) {
        this.controlRemoto = controlRemoto;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public Televisor clone() {
        Televisor televisor = new Televisor();
        televisor.setSistemaOperativo(this.sistemaOperativo);
        televisor.setVersionSistemaOperativo(this.versionSistemaOperativo);
        televisor.setPulgadas(this.pulgadas);
        televisor.setResolucion(this.resolucion);
        televisor.setHdmi(this.hdmi);
        televisor.setPuertosUsb(this.puertosUsb);
        televisor.setBluetooth(this.bluetooth);
        televisor.setControlRemoto(this.controlRemoto);
        televisor.setSerial(this.serial);
        return televisor;
    }
    public void showInformation(){
        System.out.println("Mostrando Informacion del televisor>>>>>>>>>");
        System.out.println("Sistema operativo:"+getSistemaOperativo());
        System.out.println("Version Sistema operativo:"+getVersionSistemaOperativo());
        System.out.println("Pulgadas:"+getPulgadas());
        System.out.println("Resolución:"+getResolucion());
        System.out.println("Hdmi:"+isHdmi());
        System.out.println("Numero puertos Usb:"+getPuertosUsb());
        System.out.println("Bluetooth:"+isBluetooth());
        System.out.println("Control remoto:"+isControlRemoto());
        System.out.println("Serial:"+getSerial());
    }
}
