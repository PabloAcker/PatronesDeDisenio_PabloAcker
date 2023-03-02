package Command.tarea1;

public class ContraAtaque implements ICommand{
    private Personaje personaje;

    public ContraAtaque(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void executeAction() {
        System.out.println("Nivel 4>>>>>>>>>");
        this.personaje.correr();
        this.personaje.saltar();
        this.personaje.correr();
        this.personaje.saltar();
        this.personaje.protegerse();
        this.personaje.golpear();
        this.personaje.curarse();
        this.personaje.correr();
    }
}
