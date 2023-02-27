package parcial1.interpreter.b;

public class Suma extends DivisionYSuma {

    public Suma(int digit){

        this.digit = digit;

    }


    @Override
    public void interpreter(Context context) {

        if(context.input.startsWith("+")) {

            context.operation = "s";
            context.input = context.input.substring(this.digit);

        }


    }
}
