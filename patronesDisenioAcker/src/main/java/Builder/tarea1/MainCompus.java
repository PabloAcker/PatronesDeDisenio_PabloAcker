package Builder.tarea1;

public class MainCompus {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();
        i5_Bajo compuI5 = new i5_Bajo();
        i7_Medio compuI7 = new i7_Medio();
        i9_Alto compuI9 = new i9_Alto();

        System.out.println("COmputadora i9:");
        vendedor.setTipoComputadora(compuI9);
        vendedor.buildCompus();

        Computadoras computadoras1 = vendedor.getComputadoras();
        computadoras1.showInfoCompus();

        System.out.println("**********************************");

        System.out.println("COmputadora i7:");
        vendedor.setTipoComputadora(compuI7);
        vendedor.buildCompus();

        Computadoras computadoras2 = vendedor.getComputadoras();
        computadoras2.showInfoCompus();

        System.out.println("**********************************");

        System.out.println("COmputadora i5:");
        vendedor.setTipoComputadora(compuI5);
        vendedor.buildCompus();

        Computadoras computadoras3 = vendedor.getComputadoras();
        computadoras3.showInfoCompus();

    }
}
