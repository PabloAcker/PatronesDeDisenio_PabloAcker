package state.tarea1;

public class Computadora {
    private IStateComputer stateComputer;
    //programas abiertos [String], consumo en memoria
    //RAM, consumo en CPU
    private String programasAbiertos;
    private MemoriaRAM consumoMemoriaRAM;
    private CPU consumoCPU;

    public Computadora(String programasAbiertos, MemoriaRAM consumoMemoriaRAM, CPU consumoCPU) {
        this.programasAbiertos = programasAbiertos;
        this.consumoMemoriaRAM = consumoMemoriaRAM;
        this.consumoCPU = consumoCPU;
    }

    public IStateComputer getStateComputer() {
        return stateComputer;
    }

    public void setStateComputer(IStateComputer stateComputer) {
        this.stateComputer = stateComputer;
    }

    public String getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void setProgramasAbiertos(String programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }

    public MemoriaRAM getConsumoMemoriaRAM() {
        return consumoMemoriaRAM;
    }

    public void setConsumoMemoriaRAM(MemoriaRAM consumoMemoriaRAM) {
        this.consumoMemoriaRAM = consumoMemoriaRAM;
    }

    public CPU getConsumoCPU() {
        return consumoCPU;
    }

    public void setConsumoCPU(CPU consumoCPU) {
        this.consumoCPU = consumoCPU;
    }
    public void useCOmputer(){
        this.stateComputer.computerBehavior(this);
    }
}
