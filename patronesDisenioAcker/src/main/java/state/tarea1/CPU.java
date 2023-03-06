package state.tarea1;

public class CPU {
    private int porcentajeDeUso;
    private String porcentajeTotal;

    public CPU(int porcentajeDeUso, String porcentajeTotal) {
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
    public void showInfoCPU(){
        System.out.println("Porcentaje total de CPU: "+getPorcentajeTotal()+"%");
        System.out.println("Porcentaje en uso de CPU: "+getPorcentajeDeUso()+"%");
        System.out.println("=====================================");
    }
}
