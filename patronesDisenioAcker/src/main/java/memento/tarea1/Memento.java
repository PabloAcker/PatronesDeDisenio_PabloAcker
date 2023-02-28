package memento.tarea1;
import java.util.ArrayList;
import java.util.List;

public class Memento {
    private Backup state;

    public Memento(Backup stateSaved){
        this.state=stateSaved;
    }

    public Backup getState() {
        return state;
    }
}
