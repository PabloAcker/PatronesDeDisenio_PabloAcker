package parcial1.builder.a;

public class Main {
    public static void main(String[] args) {
        Cine cine = new Cine();
        MegaCombo mega = new MegaCombo();
        MedianoCombo mediano = new MedianoCombo();
        NormalCombo normal = new NormalCombo();

        System.out.println("=================================");

        System.out.println("Pedido de un MEGA combo:");
        cine.setCombo(mega);
        cine.buildCombo();

        Combo combo1 = cine.getCombo();
        combo1.showInfo();

        System.out.println("=================================");

        System.out.println("Pedido de un combo mediano:");
        cine.setCombo(mediano);
        cine.buildCombo();

        Combo combo2 = cine.getCombo();
        combo2.showInfo();

        System.out.println("=================================");

        System.out.println("Pedido de un combo normal:");
        cine.setCombo(normal);
        cine.buildCombo();

        Combo combo3 = cine.getCombo();
        combo3.showInfo();
    }
}
