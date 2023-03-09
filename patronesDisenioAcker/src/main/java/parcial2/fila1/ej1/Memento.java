package segundoParcial.fila1.ej1;

public class Memento {
    private Documento state;
    public Memento(Documento concreteObject) {
        state = concreteObject;
    }
    public Documento getState(){
        return state;
    }
}
