import java.util.HashMap;
import java.util.Map;

public class TASK6 {
    static void main(String[] args) {
        String[] strings={"a", "b", "a"};
        System.out.println(wordAppend(strings));

    }
    public static String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        String result = "";

        for (String word : strings) {

            map.put(word, map.getOrDefault(word, 0) + 1);


            if (map.get(word) % 2 == 0) {
                result += word;
            }
        }

        return result;
    }
}
