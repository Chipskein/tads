import java.util.List;

public class Sanitizar {
    static public List<String> filtro;
    static public String censurar(String texto){
        return censurar(texto,1);
    }
    
    static public String censurar(String texto, int tamanho){
        String resultado = "";
        var palavras = texto.split("[,\s]");
        for(String palavra: palavras){
            if(filtro.contains(palavra)){
                palavra = converterParaAsterisco(palavra,palavra.length()-tamanho);
            }     
            resultado += palavra + " ";
        }
        return resultado;
    }
    static String converterParaAsterisco (String texto, int tamanho){
        String s = "";
        for (int i = 0; i < tamanho; i++) {
            s += "*";
        }
        for (int i = tamanho; i < texto.length(); i++) {
            s += texto.charAt(i);
        }
        return s;
        
    }


}
