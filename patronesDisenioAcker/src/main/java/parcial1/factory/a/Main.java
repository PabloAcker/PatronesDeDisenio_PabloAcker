package parcial1.factory.a;

public class Main {
    public static void main(String[] args) {
/*
        Batidora batidora = (Batidora) FactoryArtefacto.make("batidora");
        Microondas microondas = (Microondas) FactoryArtefacto.make("microondas");
        Radio radio = (Radio) FactoryArtefacto.make("radio");
        Refrigerador refrigerador = (Refrigerador) FactoryArtefacto.make("refrigerador");
        Television tv = (Television) FactoryArtefacto.make("television");

        batidora.create();
        microondas.create();
        radio.create();
        refrigerador.create();
        tv.create();

 */

        Batidora batidora = new Batidora();

        String artefacto = "batidora";
        FactoryArtefacto.make(artefacto).create();
    }
}
