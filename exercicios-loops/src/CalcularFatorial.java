import java.util.Scanner;

public class CalcularFatorial {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Insira o número a ser calculado o fatorial.");
        numero = scan.nextInt();
        int multipilcacao = numero;

        for (int i = (numero - 1); i >= 1; i--) {
            multipilcacao = multipilcacao * i;
        }

        System.out.println("Fatorial de " + numero + " é igual a " + multipilcacao);
     
    }
}
