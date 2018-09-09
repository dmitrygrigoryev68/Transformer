import java.util.function.Predicate;
import java.util.function.Function;

public class AppTransformer {

    public static void main(String[] args) {

        String sentence = "Ajsh jFTd yf bbb LLL kRR pSl DGFF sk  vbu okjvgfxfi";

        Transform t = new Transform();

        Predicate<String> checkl = str -> str.length() == 3;
        Predicate<String> check2 = str -> str.length() == 4;
        Predicate<String> check3 = str -> str.length() == 9;

        Function<String, String> trans1 = str -> str = str.toUpperCase();
        Function<String, String> trans2 = str -> str = str.toLowerCase();
        Function<String, String> trans3 = str -> str = "***************";


        t.print(sentence, checkl, trans1);
        t.print(sentence, check2, trans2);
        t.print(sentence, check3, trans3);
        t.print(sentence, check3, trans1);
        t.print(sentence, check3, trans2);
    }
}










