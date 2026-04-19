import java.util.HashMap;
import java.util.Map;

public class TASK3 {
    static void main(String[] args) {
        String[] strings = {"code", "bug"};
        System.out.println(pairs(strings));

    }
    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String word : strings) {
            String key = word.charAt(0) + "";
            String value = word.charAt(word.length() - 1) + "";

            map.put(key, value);
        }

        retu
        rn map;
    }
}

