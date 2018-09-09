import java.util.function.Function;
import java.util.function.Predicate;


public class Transform {

    public String transform(String sentence, Predicate<String> ch, Function<String, String> tr) {
        String words[] = sentence.split(" ");
        String finalString = "";

        for (int i = 0; i < words.length; i++) {
            if (ch.test(words[i])) {
                words[i] = tr.apply(words[i]);
                finalString = finalString + words[i] + " ";
            }
        }
        if (finalString.equals("")) {
            finalString = "No result";
        }
        return finalString;
    }

    public void print(String s, Predicate<String> ch, Function<String, String> tr) {
        System.out.println(transform(s, ch, tr));
    }
}
