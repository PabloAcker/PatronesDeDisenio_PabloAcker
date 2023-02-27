package parcial1.factory.a;

public class FactoryArtefacto {
    public static IArtefacto make (String type){
        IArtefacto artefacto;

        switch (type.toLowerCase()) {
            case "television" -> {
                Television tv = new Television();
                tv.setPrecio(2000);
            }
            case "batidora" -> {
                Batidora batidora = new Batidora();
                batidora.setPrecio(2120);
            }
            case "microondas" -> {
                Microondas microondas = new Microondas();
                microondas.setPrecio(200);
            }
            case "radio" -> {
                Radio radio = new Radio();
                radio.setPrecio(150);
            }
            case "refrigerador" -> {
                Refrigerador refri = new Refrigerador();
                refri.setPrecio(3000);
            }
            default -> {
                Television tv1 = new Television();
                tv1.setPrecio(2000);
            }
        }
        artefacto = null;
        return artefacto;
    }
}
