import java.util.Random;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        Random numerosAleatorios = new Random();

        int[][] M = new int[4][4];

        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                M[i][j] = numerosAleatorios.nextInt(9);
            }

        }

        /* M[i].length 
         * este codigo esta pegando o tamanho da linha [i] então se i for 0 ele está pegando o tamanho, ou seja quantos elementos cabem nesta
         * linha, como nossa matriz possue 4 colunas ela está pegando o tamanho(length) 4.
         * utilize o comando a seguir trocando a quantidade original de colunas da sua matriz e selecionando uma linha para 
         * verificar: System.out.println(M[linha].length);
         */

        System.out.println("Matriz: ");
       for (int[] linha : M) {
        for (int coluna : linha) {
            System.out.print(coluna + " ");
            
        }
        System.out.println();
       }
    }
}
