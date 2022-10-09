import java.util.Scanner;

public class Tabuada {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        int tabuada;

        System.out.println("De qual número você quer a tabuada?");
        tabuada = scan.nextInt();

        System.out.println("Tabuada do: " + tabuada);

        for(int contador = 1; contador <= 10; contador++){
            System.out.println(tabuada + " x " + contador + " = " + (tabuada * contador));
        }
    }
}
