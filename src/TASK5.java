import java.util.HashMap;
import java.util.Map;

public class TASK5 {
    static void main(String[] args) {
        String[]strings={"salt", "tea", "soda", "toast"};
        System.out.println(fristChar(strings));

    }
    public static Map<String,String>fristChar(String[]strings){
        Map<String,String>map=new HashMap<>();
        for (String WORD:strings){
            String KEY=WORD.substring(0,1);
            if (map.containsKey(KEY)){
                map.put(KEY,map.get(KEY)+WORD);

            }else {
                map.put(KEY,WORD);
            }
        }
        return map;
    }
}
