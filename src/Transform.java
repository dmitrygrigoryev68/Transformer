public class Transform {

    public String transform(String sentence, CheckLenght ch, TransformString tr) {
        String words[] = sentence.split(" ");
        String finalString = "";

        for (int i = 0; i < words.length; i++) {
            if (ch.checkLenght(words[i])) {
                words[i] = tr.transformString(words[i]);
                finalString = finalString + words[i] + " ";
            }
        }
        if (finalString.equals("")) {
            finalString = "No result";
        }
        return finalString;
    }

    public void print(String s, CheckLenght ch, TransformString tr) {
        System.out.println(transform(s, ch, tr));
    }
}
