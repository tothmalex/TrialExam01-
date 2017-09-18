import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Dictionary01{
    static Map<String,String> map;

    public static void main(String[] args) {
        map = new HashMap<String,String>();
        map.put("alma", "apple");
        map.put("fa", "tree");

        addWord("korte", "pear" );

        removeWord("alma");

        translateToHun("apple");

        System.out.println(translateToEng("alma"));

    }

    // Implement this method. It should add the given key-value pair to the the map
    public static void addWord(String hunWord, String engWord) {
        map.put(hunWord, engWord);
        System.out.println(Arrays.asList(map));
    }

    // Implement this method. It should remove the key-value pair by the given key from the map
    public static void removeWord(String hunWord) {
        map.remove(hunWord);
        System.out.println(Arrays.asList(map));
    }

    // Implement these methods. They should return the translation of the given word from the map
    public static String translateToHun(String engWord) {
        String value = map.get(engWord);
        System.out.println(value);
        return null;
    }

    public static String translateToEng(String hunWord) {
        String value = map.get(hunWord);
        System.out.println(value);
        return null;
    }
}