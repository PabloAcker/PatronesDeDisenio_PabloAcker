package parcial1.interpreter.a;

import java.util.ArrayList;
import java.util.List;

public class Evaluador {
    private List<OperacionMatematica> formula = new ArrayList<>();
    private Context context;

    public Evaluador(String formulaOriginal){
        context = new Context(formulaOriginal.replace(" ",""));
        for (String msg:formulaOriginal.split(" ")){
            switch (msg){
                case "+":
                    formula.add(new Suma());
                    break;
                case "*":
                    formula.add(new Multiplicacion());
                    break;
                default:
                    formula.add(new NumberExpression(msg.length()));
                    break;
            }
        }
    }

    public int evaluarFormula(){
        for (OperacionMatematica operacionMatematica:formula) {
            operacionMatematica.interpreter(context);
        }
        return context.output;
    }
}
