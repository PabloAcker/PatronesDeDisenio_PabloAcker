package Composite.tarea1;

import java.util.Stack;

public class Singleton {
    private Stack<String> singleton = new Stack<>();
    private int precioGlobal = 0;
    private static Singleton instance;
    private Singleton() {}
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public void add(String info) {
        singleton.push(info);
    }
    public void showInfo() {
        while(!singleton.isEmpty()) {
            System.out.print(singleton.pop());
        }
    }
    public int getPrecioGlobal() {
        return precioGlobal;
    }
    public void setPrecioGlobal(int precioGlobal) {
        this.precioGlobal = precioGlobal;
    }
}
