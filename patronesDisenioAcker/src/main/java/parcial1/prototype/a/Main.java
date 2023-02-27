package parcial1.prototype.a;

public class Main {
    public static void main(String[] args) {
        Televisor televisor1 = new Televisor();
        televisor1.setSistemaOperativo("Android");
        televisor1.setVersionSistemaOperativo("11.0");
        televisor1.setPulgadas(80);
        televisor1.setResolucion(50);
        televisor1.setHdmi(true);
        televisor1.setPuertosUsb(4);
        televisor1.setControlRemoto(true);
        televisor1.setBluetooth(true);
        televisor1.setSerial("0000000000");

        Televisor t2 = televisor1.clone();
        t2.setSerial("1234567890");

        Televisor t3 = televisor1.clone();
        t3.setSerial("0987654321");

        Televisor t4 = televisor1.clone();
        t4.setSerial("1357908642");

        Televisor t5 = televisor1.clone();
        t5.setSerial("1047819414");

        Televisor t6 = televisor1.clone();
        t6.setSerial("2452683264");

        t2.showInformation();
        t3.showInformation();
        t4.showInformation();
        t5.showInformation();
        t6.showInformation();

    }
}
