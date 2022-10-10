public class CalcularEmprestimo {
    public static void calcularEmprestimo(int valor, int parcelas){
        double totalComJuros = valor + (valor * 0.186) * parcelas;
        System.out.println("O valor final após as " + parcelas + " parcelas será de " + "R$" + totalComJuros);
    }
}
