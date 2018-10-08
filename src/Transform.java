import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Transform {


    private String transform(String sentence, Predicate<String> checkWordLenght, Function<String, String> transfornationMethod) {
        String words[] = sentence.split(" ");

        return Stream.of(words)
                .map(s->checkWordLenght.test(s)?transfornationMethod.apply(s):s)
        .collect(Collectors.joining(", "));

/*      List<String> list = Arrays.asList(words);
        finalString =  list
                .stream()
                .filter(s->checkWordLenght.test(s))
                .map(s->s=transfornationMethod.apply(s))
                .collect(Collectors.joining(", "));


        for (String word : words) {
            if (checkWordLenght.test(word)) {
                word = transfornationMethod.apply(word);
            }
            finalString += word + ", ";
        }*/

    }

    public void print(String s, Predicate<String> ch, Function<String, String> tr) {
        System.out.println(transform(s, ch, tr));
    }
}
