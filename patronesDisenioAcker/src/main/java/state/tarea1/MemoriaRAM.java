package state.tarea1;

public class MemoriaRAM {
    private int porcentajeDeUso;
    private String porcentajeTotal;

    public MemoriaRAM(int porcentajeDeUso, String porcentajeTotal) {
        this.porcentajeDeUso = porcentajeDeUso;
        this.porcentajeTotal = porcentajeTotal;
    }

    public int getPorcentajeDeUso() {
        return porcentajeDeUso;
    }

    public void setPorcentajeDeUso(int porcentajeDeUso) {
        this.porcentajeDeUso = porcentajeDeUso;
    }

    public String getPorcentajeTotal() {
        return porcentajeTotal;
    }

    public void setPorcentajeTotal(String porcentajeTotal) {
        this.porcentajeTotal = porcentajeTotal;
    }
    public void showInfoMemoryRAM(){
        System.out.println("Porcentaje total de la memoria RAM: "+getPorcentajeTotal()+"%");
        System.out.println("Porcentaje en uso de la memoria RAM: "+getPorcentajeDeUso()+"%");
    }
}
