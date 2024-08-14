public class GeradorMnemonico {
    public static String gerar (String frase){
        String resultado = "";
        var palavras = frase.split("[,\s]");
        for(String palavra: palavras){
            try{
                int n =Integer.parseInt(palavra);
                resultado+=""+n;
            }
            catch(NumberFormatException e){
                var primeiroChar = palavra.charAt(0);
                resultado+=primeiroChar;
            }
        }
        return resultado; 
    }     
}
