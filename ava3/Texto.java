class Texto{
    static String substr(String str,int begin,int end){
        String s="";
        if (str==null){
            return "";
        }

        if (Math.abs(end)>str.length()) {
            end=str.length();
        }

        if (Math.abs(begin)>str.length()){
            return s;
        }

        if (begin < 0){
            begin += str.length();
            
        }
        if (end < 0){
            end += str.length();
            
        }
        for (int i = begin; i < end; i++) {
            s += str.charAt(i);
        }

        return s;
    }

    static  String substr(String str,int begin){
        return substr(str, begin, str.length());
    }

    static  String substr(String str,int ...pares){
        String s="";
        for(int i=0;i<pares.length;i+=2){
            int begin=pares[i];
            int end=str.length();
            if (i+1!=pares.length){
                end=pares[i+1];
            }
            s+=substr(str,begin,end);
        }
        return s;
    }
    

}