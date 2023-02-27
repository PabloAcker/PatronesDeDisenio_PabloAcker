package parcial1.interpreter.b;

public class Numero extends DivisionYSuma {

    public Numero(int digit){

        this.digit = digit;

    }


    @Override
    public void interpreter(Context context) {

        if(context.operation.equals("f")) {

            context.output = Integer.parseInt(context.input.substring(0, this.digit));


        } else if(context.operation.equals("d")) {

            context.output = context.output / Integer.parseInt(context.input.substring(0, this.digit));

        } else{

            context.output = context.output + Integer.parseInt(context.input.substring(0, this.digit));

        }

        context.input = context.input.substring(this.digit);


    }
}
