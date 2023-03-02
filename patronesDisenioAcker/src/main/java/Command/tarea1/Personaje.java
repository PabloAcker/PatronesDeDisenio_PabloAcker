package Command.tarea1;

import javax.lang.model.element.Name;

public class Personaje {
    private String name;
    private String alias;
    private String juegoAlQuePertenece;

    public Personaje(String name, String alias, String juegoAlQuePertenece) {
        this.name = name;
        this.alias = alias;
        this.juegoAlQuePertenece = juegoAlQuePertenece;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getJuegoAlQuePertenece() {
        return juegoAlQuePertenece;
    }

    public void setJuegoAlQuePertenece(String juegoAlQuePertenece) {
        this.juegoAlQuePertenece = juegoAlQuePertenece;
    }
    public void correr(){
        System.out.println(getName()+", o mejor dicho "+getAlias()+" esta corriendo lo mas rapido que puede!");
    }
    public void protegerse(){
        System.out.println(getAlias()+" se protegeeee!");
    }
    public void curarse(){
        System.out.println(getAlias()+ " se empieza a curar!");
    }
    public void saltar(){
        System.out.println(getAlias()+" empieza a saltar!!");
    }
    public void golpear(){
        System.out.println(getAlias()+" esta golpeando con todo lo que tiene!");
    }
}
