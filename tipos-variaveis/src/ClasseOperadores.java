public class ClasseOperadores {
    public static void main (String[] args){
        int a = 7;
        int b = 6;

       /* 
        String resultado = "";

        if (a==b)
            resultado = "a é igual a b";
        else
            resultado = "a não é igual a b";   */

        String resultado = a==b ? "\"a\" é igual a \"b\"" : "\"a\" não é igual a \"b\"";
        
     System.out.println(resultado);

        String nomeUm = "Aron";
        String nomeDois = new String("Aron");

        System.out.println(nomeUm.equals(nomeDois));
        

    }
}