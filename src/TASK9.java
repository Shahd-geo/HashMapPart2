import java.util.HashMap;
import java.util.Map;

public class TASK9 {
    static void main(String[] args) {
        String[] strings=

     }
     public static String[]firstSwap(String[] strings){
         Map<String,Integer>map=new HashMap<>();
         for (int i = 0;i<strings.length;i++){
             String WORD=strings[i];
             String FRISTPART =WORD.substring(0,1);
             if (map.containsKey(FRISTPART)){
                 int index=map.get(FRISTPART);
                 String SWAAP =strings[i];
                 strings[i]=strings[index];
                 strings[index]=SWAAP;


             }else{
                 map.put(FRISTPART,i);

             }

         }
         return map;
     }
}
