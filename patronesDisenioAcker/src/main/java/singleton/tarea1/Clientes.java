package singleton.tarea1;

import java.io.IOException;

public class Clientes {

    private String name;

    public Clientes(String name) throws IOException {
        Logger.getInstance().registro("Create instance : "+name);
        this.name = name;
    }

    public String getName() throws IOException {
        Logger.getInstance().registro("get name : Nombre "+name);
        return name;
    }

    public void setName(String name) throws IOException {
        Logger.getInstance().registro("set name : Nombre "+name);
        this.name = name;
    }

}

