import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Transform {


    private String transform(String sentence, Predicate<String> checkWordLenght, Function<String, String> transformationMethod) {
        String words[] = sentence.split(" ");
        List<String> list = Arrays.asList(words);
        return list
                .stream()
                .filter(checkWordLenght)
                .map(s -> transformationMethod.apply(s))
                .collect(Collectors.joining(", "));
    }

    public void print(String s, Predicate<String> check, Function<String, String> transform) {
        System.out.println(transform(s, check, transform));
    }
}
