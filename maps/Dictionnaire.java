package maps;
import java.util.HashMap;
import java.util.Map;


public class Dictionnaire {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("un", 1);
        map.put("deux", 2);

        map.put("un", 3);
        
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            printEntry(entry);
        }
    }

    static void printEntry(Map.Entry<String, Integer> entry) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}