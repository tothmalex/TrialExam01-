import java.util.HashMap;
import java.util.Map;

public class Dictionary02{
    static Map<String,String> map;

    public static void main(String[] args) {
        map = new HashMap<String,String>();
        map.put("alma", "apple");
        map.put("fa", "tree");
        addWord("macska", "cat");
        addWord("kacsa", "duck");
        removeWord("fa");

        System.out.println(map);
        System.out.println(translateToHun("apple"));
        System.out.println(translateToEng("kacsa"));
    }

    public static void addWord(String hunWord, String engWord) {
        map.put(hunWord, engWord);
    }

    public static void removeWord(String hunWord) {
        map.remove(hunWord);
    }

    public static String translateToHun(String engWord) {
        for (String hungarian: map.keySet()) {
            if (map.get(hungarian).equals(engWord)) {
                return hungarian;
            }
        }
        return "Sorry, there's no such word in the dictionary.";
    }

    public static String translateToEng(String hunWord) {
        return map.get(hunWord);
    }
}