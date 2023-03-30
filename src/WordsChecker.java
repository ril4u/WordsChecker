import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected String txt;

    public WordsChecker(String txt) {
        this.txt = txt;
    }

    public boolean hasWord(String word) {
        Set<String> set = new HashSet<>();
        String[] list = this.txt.split("\\P{IsAlphabetic}+");
        for (int i = 0; i < list.length; i++) {
            set.add(list[i]);
        }
        return set.contains(word);
    }
}
