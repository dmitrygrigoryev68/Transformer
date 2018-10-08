import java.util.function.*;

public class AppTransformer {

    public static void main(String[] args) {

        String sentence = "Ajsh jFTd yf bbb LLL kRR pSl DGFF InSkyLine  vbu okjvHESfi";

        Transform t = new Transform();

        Predicate<String> isWordLenght_3 = str -> str.length() == 3;
        Predicate<String> isWordLenght_4 = str -> str.length() == 4;
       // Predicate<String> isWordLenght_9 = str -> str.length() == 9;

        Function<String, String> transformationMethodToUpperCase = str -> str = str.toUpperCase();
        Function<String, String> transformationMethodToLowerCase = str -> str = str.toLowerCase();
     //   Function<String, String> transformationMethodToStars = str -> str = "*******";


        t.print(sentence, isWordLenght_3, transformationMethodToUpperCase);
        t.print(sentence, isWordLenght_4, transformationMethodToLowerCase);
       // t.print(sentence, isWordLenght_9, transformationMethodToStars);
      //  t.print(sentence, isWordLenght_9, transformationMethodToUpperCase);
       // t.print(sentence, isWordLenght_9, transformationMethodToLowerCase);

    }
}












