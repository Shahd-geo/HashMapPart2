import java.util.HashMap;
import java.util.Map

public class TASK2 {
    static void main(String[] args) {
        String[] strings = {"this", "and", "that", "and"};


    }

    public static Map<String, Integer> wordLen(String[] strings) {

        Map<String, Integer> map = new HashMap<>();
        for (String word : strings) {
            map.put(word, word.length());
        }

        return map;
    }
}

