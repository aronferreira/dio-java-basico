import java.util.Scanner;

public class Main {
    public static void main (String[] args){
    Scanner scan = new Scanner(System.in);

    Carro carro = new Carro();

    carro.setModelo("uno com escada");
    carro.setCor("vermelho");

    System.out.println("Qual a capacidade de seu carro em litros?");
    int capacidade = scan.nextInt();

    carro.setCapacidadeTanque(capacidade);

    System.out.println("O valor total para abastecer o seu " + carro.getModelo() + " de cor " + carro.getCor() + " e capacidade de " + carro.getCapacidadeTanque()
    + " litros é " + carro.totalValorTanque(5.12) + " reais.");
    

}

    
}
