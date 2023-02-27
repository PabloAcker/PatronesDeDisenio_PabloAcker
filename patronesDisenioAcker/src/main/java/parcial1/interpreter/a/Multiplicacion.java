package parcial1.interpreter.a;

public class Multiplicacion extends OperacionMatematica {
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("*")){
            context.multiplicacion=true;
            context.input=context.input.substring(1);
        }
    }
}
