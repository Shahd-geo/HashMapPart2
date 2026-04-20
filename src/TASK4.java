import java.util.HashMap;
import java.util.Map;

public class TASK4 {
    static void main(String[] args) {

    }
    public static Map<String,Integer>WORDCOUNT(String[] STRINGS){
        Map<String,Integer>MAP=new HashMap<>();
        for (String WORD:STRINGS){
            if (MAP.containsKey(WORD)){
                MAP.put(WORD,MAP.get(WORD)+1);

            }else {
                MAP.put(WORD,1);
            }
        }
        return MAP;

    }
}
