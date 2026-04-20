import java.util.HashMap;
import java.util.Map;

public class TASK8 {
    static void main(String[] args) {
        String[]strings=

    }
    public static String[] allSwap(String[]strings){
        Map<String,Integer>map=new HashMap<>();
        for (int i = 0 ; i <strings.length;i++){
            String word=strings[i];
            String key = word.substring(0,1);
            if (map.containsKey(key)){
                int index =map.get(key);
                String swapp=strings[i];
                strings[i]=strings[index];
                strings[index]=swapp;
                map.remove(key);
            }else{
                map.put(key,i);
            }

        }
        return strings;
    }
}
