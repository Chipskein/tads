import java.util.List;
import java.util.Random;
public class GeradorSenha {

    static public List<String> dicionario;
    static public String gerar(int tamanho){
        var s = "";
        Random r = new Random();
        for (int i = 0; i < tamanho; i++) {
            var index  = r.nextInt(dicionario.size());
            s += dicionario.get(index);
        }
        return s;
    };


    
}
