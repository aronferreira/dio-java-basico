import java.util.Scanner;

public class MaiorEMedia {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0;
        int media;

        do {
            System.out.println("Insira um número");
            numero = scan.nextInt();

            if (numero > maior) maior = numero;

            soma = soma + numero;

            count = count + 1;

        } while (count < 5);

        media = soma / 5;
        System.out.println("A soma de todos os valores informados é " + soma + " e a média desses valores é " + media);
    }


    
}
