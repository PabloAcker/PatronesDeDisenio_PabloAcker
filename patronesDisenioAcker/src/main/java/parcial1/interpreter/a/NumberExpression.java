package parcial1.interpreter.a;

public class NumberExpression extends OperacionMatematica{
    public NumberExpression(int digit){
        this.digit=digit;
    }

    @Override
    public void interpreter(Context context) {
        if (context.multiplicacion){
            context.output*=Integer.parseInt(context.input.substring(0,this.digit));
        } else {
            context.output=context.output+ (Integer.parseInt(context.input.substring(0,this.digit)));
        }
        context.input=context.input.substring(this.digit);
    }
}
