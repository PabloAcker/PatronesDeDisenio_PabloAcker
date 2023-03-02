package Command.tarea1;

public class Correr implements ICommand{
    private Personaje personaje;

    public Correr(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void executeAction() {
        System.out.println("Nivel 1>>>>>");
        this.personaje.correr();
    }
}
