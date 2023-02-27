package parcial1.interpreter.b;

public class Division extends DivisionYSuma {

    public Division(int digit){

        this.digit = digit;

    }


    @Override
    public void interpreter(Context context) {

        if(context.input.startsWith("/")) {

            context.operation = "d";
            context.input = context.input.substring(this.digit);

        }


    }

}
