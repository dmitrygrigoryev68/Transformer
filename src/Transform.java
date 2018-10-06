import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Transform {


    private String transform(String sentence, Predicate<String> checkWordLenght, Function<String, String> trnsfornationMethod) {
        String words[] = sentence.split(" ");
        final String finalString = "";
        List<String> list = Arrays.asList(words);
        return list
                .stream()
                .filter(s -> checkWordLenght.test(s))
                .map(s -> trnsfornationMethod.apply(s) + finalString)
                .collect(Collectors.joining(", "));
    }

    public void print(String s, Predicate<String> ch, Function<String, String> tr) {
        System.out.println(transform(s, ch, tr));
    }
}
