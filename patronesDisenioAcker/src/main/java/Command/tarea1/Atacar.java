package Command.tarea1;

import ChainOfResponsability.tarea1.IHandler;

public class Atacar implements ICommand {
    private Personaje personaje;

    public Atacar(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void executeAction() {
        System.out.println("Nivel 3>>>>>>>");
        this.personaje.saltar();
        this.personaje.correr();
        this.personaje.golpear();
    }
}
