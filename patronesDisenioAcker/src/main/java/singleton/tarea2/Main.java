package singleton.tarea2;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Celular venta = new Celular("Samsumg R10",
                "20cm","4","5.3.0",
                "3 MP","Si",4,
                "2000 mAh","Audifono, Cargador, Estuche");
        venta.setSim(new Sim("Entel","60133823"));
        venta.showInfo();

        Celular venta1 = venta.clone();
        venta1.setSim(new Sim("Cotel","21374918"));
        venta1.showInfo();

        Celular venta2 = venta.clone();
        venta2.setSim(new Sim("Viva","64391642"));
        venta2.showInfo();

        Celular venta3 = venta.clone();
        venta3.setSim(new Sim("Claro","1489146"));
        venta3.showInfo();

        Celular venta4 = venta.clone();
        venta4.setSim(new Sim("Tigo","71544208"));
        venta4.showInfo();
        System.out.println("***************************************");
    }
}
