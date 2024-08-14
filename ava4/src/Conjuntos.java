
import java.util.HashSet;
import java.util.Set;


public class Conjuntos {
    public static Set<Integer>  uniao(Set<Integer> c1 ,Set<Integer>c2){
        var t=new HashSet<Integer>(c1);
        t.addAll(c2);
        return t;
    }

    public static Set<Integer>  diferenca(Set<Integer> c1 ,Set<Integer>c2){
        var t=new HashSet<Integer>();
        t.addAll(c1);
        for(Integer value:c2){
            if(t.contains(value)){
                t.remove(value);
            }
        }
        return t;
    }
    
    public static Set<Integer>  interseccao(Set<Integer> c1 ,Set<Integer>c2){
        var t=new HashSet<Integer>();
        for(Integer value:c1){
            if(c2.contains(value)){
                t.add(value);
            }
        }
        for(Integer value:c2){
            if(c1.contains(value)){
                if (!t.contains(value)) {
                    t.add(value);    
                }
            }
        }
        return t;
    }
}
