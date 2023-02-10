package singleton.tarea1;

import java.io.IOException;
public class Promociones {

    private String name_promocion;

    public Promociones(String name_promocion){
        this.name_promocion = name_promocion;
    }
    public String getName_promocion() {
        return name_promocion;
    }
    public void setName_promocion(String name_promocion) {
        this.name_promocion = name_promocion;
    }
}
