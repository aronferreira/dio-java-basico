import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o primeiro valor:");
        int primeiroNumero = scan.nextInt();
        System.out.println("Insira o segundo valor:");
        int segundoNumero = scan.nextInt();

        Calculadora.soma(primeiroNumero, segundoNumero);
        Calculadora.multiplicar(primeiroNumero, segundoNumero);
        Calculadora.subtrair(primeiroNumero, segundoNumero);
        Calculadora.dividir(primeiroNumero, segundoNumero);

        System.out.println("Que horas são?");
        int horaDia = scan.nextInt();
        MensagemHoraDoDia.mensagemHoraDia(horaDia);

        System.out.println("Qual o valor do empréstimo?");
        int valorEmprestimo = scan.nextInt();
        System.out.println("Você pretende pagar em quantas parcelas?");
        int numeroDeParcelas = scan.nextInt();
        CalcularEmprestimo.calcularEmprestimo(valorEmprestimo, numeroDeParcelas);
    };

}