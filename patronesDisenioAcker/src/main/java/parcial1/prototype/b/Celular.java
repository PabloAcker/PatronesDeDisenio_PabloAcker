package parcial1.prototype.b;

public class Celular implements ICelular{
    private String modelo;
    private String tamanio;
    private String peso;
    private Camara camara = new Camara(0,"");
    private String imei;
    private String origen;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public Camara getCamara() {
        return camara;
    }

    public void setCamara(Camara camara) {
        this.camara = camara;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public Celular clone() {
        Celular celular = new Celular();
        celular.setModelo(this.modelo);
        celular.setTamanio(this.tamanio);
        celular.setPeso(this.peso);
        celular.setCamara(this.getCamara());
        celular.setImei(this.imei);
        celular.setOrigen(this.origen);
        return celular;
    }
    public void showInformationCelular(){
        System.out.println("Mostrando Informacion del celular>>>>>>>>>");
        System.out.println("Modelo:"+getModelo());
        System.out.println("Tamaño:"+getTamanio());
        System.out.println("Peso:"+getPeso());
        camara.ShowInfoCamara();
        System.out.println("Imei:"+getImei());
        System.out.println("Origen:"+getOrigen());
    }

}
