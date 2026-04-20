import java.util.HashMap;
import java.util.Map;

public class TASK7 {
    static void main(String[] args) {
       // String[] strings={"a", "b", "a", "c", "b"};
        String[] strings= {"c", "b", "a"};
        System.out.println(wordMultiple(strings));
    }

    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String WORD : strings) {
            if (!map.containsKey(WORD)) {
                map.put(WORD, false);
            } else {
                map.put(WORD, true);
            }

        }
        return map;
    }
}

