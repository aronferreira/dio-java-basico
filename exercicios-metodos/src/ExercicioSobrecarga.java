public class ExercicioSobrecarga {
    public static void main (String[] args){
        int alturaQuadrado = 2, retanguloAltura = 5, retanguloBase = 2, trapezioBase = 2, trapezioAltura = 3, trapezioBase2 = 4;
        ExercicioSobrecarga.calcularArea(alturaQuadrado, alturaQuadrado, 0, "quadrado");
        ExercicioSobrecarga.calcularArea(retanguloAltura, retanguloBase, 0, "retângulo");
        ExercicioSobrecarga.calcularArea(trapezioBase, trapezioBase2, trapezioAltura, "trapézio");

    }

    public static void calcularArea(int valorA, int valorB, int valorC, String formaGeometrica){
        if (formaGeometrica.equals("trapézio")){
            int resultado = ((valorA + valorB) * valorC) / 2;
            System.out.println("A área do " + formaGeometrica + " é: " + resultado);
        } else{
        int resultado = valorA * valorB;
        System.out.println("A área do " + formaGeometrica + " é: " + resultado);
     }
    }


    /* 
     * maneira correta de se fazer:


public class Quadrilatero {

    public static void area(double lado) {

        System.out.println("Área do quadrado:" + lado * lado);
    }

    public static void area(double lado1, double lado2) {

        System.out.println("Área do retângulo:" + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {

        System.out.println("Área do trapézio:" + ((baseMaior+baseMenor)*altura) / 2);
    }

    public static void area(float diagonal1, float diagonal2) {

        System.out.println("Área do losango:" + (diagonal1 * diagonal2)/2);
    }

}
     */
}
