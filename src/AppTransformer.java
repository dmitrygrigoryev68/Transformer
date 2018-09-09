import java.util.function.Predicate;
import java.util.function.Function;

public class AppTransformer {

    public static void main(String[] args) {

        String sentence = "Ajsh jFTd yf bbb LLL kRR pSl DGFF sk  vbu okjvgfxfi";

        Transform t = new Transform();

        Predicate<String> chl = str -> str.length() == 3;
        Predicate<String> ch2 = str -> str.length() == 4;
        Predicate<String> ch3 = str -> str.length() == 9;

        Function<String, String> tr1 = str -> str = str.toUpperCase();
        Function<String, String> tr2 = str -> str = str.toLowerCase();
        Function<String, String> tr3 = str -> str = "***************";


        t.print(sentence, chl, tr1);
        t.print(sentence, ch2, tr2);
        t.print(sentence, ch3, tr3);
        t.print(sentence, ch3, tr1);
        t.print(sentence, ch3, tr2);
    }
}










