package parcial1.interpreter.a;

public class LaucnhOperacion {
    public static void main(String[] args) {
        String operacion = "2 * 3 + 5 + 5 + 5";
        Evaluador evaluador = new Evaluador("* "+operacion);
        System.out.println("resultado final: "+evaluador.evaluarFormula());
    }
}
