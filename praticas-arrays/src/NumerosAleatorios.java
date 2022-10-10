import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] NumerosAleatorios = new int[20];

        for (int i = 0; i < NumerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            NumerosAleatorios[i] = numero;
        }

        for (int valor : NumerosAleatorios) {
            System.out.println("O número aleatório gerado foi " + valor + " e seu sucessor é " + (valor + 1) + " ");
            
        }
    }
}
