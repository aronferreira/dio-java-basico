public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        byte byteValorMinimo = -128;
        byte byteValorMaximo = 127;

        short shortValorMinimo = -32768;
        short shortValorMaximo = 32767;

        int intValorMinimo = -2147483648;
        int intValorMaximo = 2147483647;

        long longValorMinimo = -9223372036854775808L;
        long longValorMaximo = 9223372036854775807L;

        // Double é mais comum que Float para números fracionados pois Float é só mantem uma precisão decimal entre 6 e 7 dígitos.
        // Após um número Long é necessário colocar um L no fim e após um número Float é necessário colocar um F no fim.

        System.out.print("O valor minimo para byte é: " + byteValorMinimo + " E o máximo é: " + byteValorMaximo + " O valor minimo para short é:  "
         + shortValorMinimo + " E o máximo é: " + shortValorMaximo + " O valor minimo para int é:  " + intValorMinimo
          + " E o máximo é: " + intValorMaximo + " O valor minimo para long é:  " + longValorMinimo + " E o máximo é: " + longValorMaximo);


    }
}
