public class Calculadora implements OperacaoMatematica {

    @Override
    public void soma(double operando1, double operando2){
        System.out.println("Soma é igual a " + (operando1 + operando2));
    };

    @Override
    public void subtracao(double operando1, double operando2){
        System.out.println("Subtração é igual a " + (operando1 - operando2));
    };

    @Override
    public void multiplicacao(double operando1, double operando2){
        System.out.println("Multiplicação é igual a " + (operando1 * operando2));
    };

    @Override
    public void divisao(double operando1, double operando2){
        System.out.println("Divisão é igual a " + (operando1 / operando2));
    };


}