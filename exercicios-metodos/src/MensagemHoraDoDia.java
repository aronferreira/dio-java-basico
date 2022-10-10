public class MensagemHoraDoDia {
    public static void mensagemHoraDia(int hora){
        if (hora >= 5 && hora < 12){
            System.out.println("Bom dia!");
        } else if (hora >= 12 && hora < 18){
            System.out.println("Boa tarde!");
        } else if (hora >= 18 && hora <= 23 || hora <= 4){
            System.out.println("Boa noite!");
        } else {
            System.out.println("ERRO! VALOR INVÁLIDO");
        }
    }
}
