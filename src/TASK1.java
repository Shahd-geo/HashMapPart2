import java.util.HashMap;
import java.util.Map;

public class TASK1 {
    public static Map<String, Integer> word0(String[] strings) {

        Map<String, Integer> wordHashMap = new HashMap<>();

        for (String word : strings) {
            wordHashMap.put(word, 0);
        }

        return wordHashMap;
    }

    public static void main(String[] args) {
        String[] strings = {"a", "b", "a", "c"};

        System.out.println(word0(strings));
    }
}

