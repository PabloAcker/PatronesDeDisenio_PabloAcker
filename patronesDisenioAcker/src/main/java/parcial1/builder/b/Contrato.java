package parcial1.builder.b;

public class Contrato {
    private String costo;
    private String empresa;
    private String listaCanales;

    public String getCosto() {
        return costo;
    }

    public Contrato setCosto(String costo) {
        this.costo = costo;
        return this;
    }

    public String getEmpresa() {
        return empresa;
    }

    public Contrato setEmpresa(String empresa) {
        this.empresa = empresa;
        return this;
    }

    public String getListaCanales() {
        return listaCanales;
    }

    public Contrato setListaCanales(String listaCanales) {
        this.listaCanales = listaCanales;
        return this;
    }
    public void showContrato(){
        System.out.println("Costo: "+getCosto());
        System.out.println("Empresa: "+getEmpresa());
        System.out.println("Lista de Canales: "+getListaCanales());
    }
}
