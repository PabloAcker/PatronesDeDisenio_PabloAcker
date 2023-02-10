package singleton.tarea1;

import java.io.IOException;
public class Facturas {
    private String nit;

    public Facturas(String nit) throws IOException {
        Logger.getInstance().registro("Create instance : "+nit);
        this.nit = nit;
    }

    public String getNit() throws IOException {
        Logger.getInstance().registro("get nit : NIT"+nit);
        return nit;
    }

    public void setNit(String nit) throws IOException {
        Logger.getInstance().registro("set nit : NIT"+nit);
        this.nit = nit;
    }
}
