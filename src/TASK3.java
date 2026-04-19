import java.util.HashMap;
import java.util.Map;

public class TASK3 {
    static void main(String[] args) {
        String[] strings = {"this", "and", "that", "and"};
        System.out.println(wordLen(strings));

    }
    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String word : strings) {
            map.put(word.charAt(i), word.charAt(word.length()-1));
        }

        return map;
    }
}

