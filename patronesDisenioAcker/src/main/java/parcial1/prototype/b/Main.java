package parcial1.prototype.b;

public class Main {
    public static void main(String[] args) {
        Celular cel = new Celular();

        cel.setModelo("A1");
        cel.setTamanio("Grande");
        cel.setPeso("60");
        cel.setCamara(new Camara(10, "5mp"));
        cel.setImei("10001");
        cel.setOrigen("Bolivia");
        cel.showInformationCelular();

        System.out.println("----------------------------------");

        Celular cel1 = cel.clone();
        cel1.setImei("10002");
        cel1.showInformationCelular();

        System.out.println("----------------------------------");

        Celular cel2 = cel.clone();
        cel2.setImei("10003");
        cel2.showInformationCelular();

        System.out.println("----------------------------------");

        Celular cel3 = cel.clone();
        cel3.setImei("10004");
        cel3.showInformationCelular();

        System.out.println("----------------------------------");

        Celular cel4 = cel.clone();
        cel4.setImei("10005");
        cel4.showInformationCelular();

        System.out.println("----------------------------------");

        Celular cel5 = cel.clone();
        cel5.setImei("10006");
        cel5.showInformationCelular();
    }
}
