package parcial1.interpreter.b;

public class Client {
    public static void main(String[] args) {

        String msg = "10 / 2 + 5 + 5 + 5";

        Interpreter parser = new Interpreter(msg);

        System.out.println(parser.evaluateOperation());


    }
}
