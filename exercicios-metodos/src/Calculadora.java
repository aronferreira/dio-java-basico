public class Calculadora {
    public static void soma(int numero1, int numero2){
        int resultado = numero1 + numero2;
        System.out.println("O resultado da soma é " + resultado);
    }

    public static void multiplicar(int numero1, int numero2){
        int resultado = numero1 * numero2;
        System.out.println("O resultado da multiplicação é: " + resultado);
    }

    public static void subtrair(int numero1, int numero2){
        int resultado = numero1 - numero2;
        System.out.println("O resultado da subtração é: " + resultado);
    }

    public static void dividir(int numero1, int numero2){
        int resultado = numero1 / numero2;
        System.out.println("O resultado da divisão é: " + resultado);
    }
}
