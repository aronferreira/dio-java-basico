public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();

        System.out.println("TV está ligada? " + smartTv.ligada);
        System.out.println("Qual o canal? " + smartTv.canal);
        System.out.println("Qual o volume? " + smartTv.volume);

        smartTv.ligar();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.escolherCanal(39);

        System.out.println("TV está ligada? " + smartTv.ligada);
        System.out.println("Qual o volume? " + smartTv.volume);
        System.out.println("Qual o canal? " + smartTv.canal);
    }
}
