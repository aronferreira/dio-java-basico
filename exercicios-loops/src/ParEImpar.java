import java.util.Scanner;

public class ParEImpar {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        int quantidadeDeNumeros;
        int contagem = 0;
        int numero;
        int quantPares = 0, quantImpares = 0;


        System.out.println("Quantos números você quer?");
        quantidadeDeNumeros = scan.nextInt();

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            contagem++;

        } while(contagem < quantidadeDeNumeros);

        System.out.println("Quantidade de números par: " + quantPares);
        System.out.println("Quantidade de números ímpares: " + quantImpares);

    }
    
}
