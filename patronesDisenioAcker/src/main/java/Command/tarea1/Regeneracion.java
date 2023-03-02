package Command.tarea1;

public class Regeneracion implements ICommand{
    private Personaje personaje;

    public Regeneracion(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void executeAction() {
        System.out.println("Nivel 2>>>>>>");
        this.personaje.protegerse();
        this.personaje.curarse();
    }
}
