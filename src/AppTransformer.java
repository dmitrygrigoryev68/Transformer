public class AppTransformer {

    public static void main(String[] args) {

        String sentence = "Ajsh jFTd yf bbb LLL kRR pSl DGFF sk  vbu okjvgfxfi";

        Transform t = new Transform();

        CheckLenght chl = str -> str.length() == 4;
        CheckLenght ch2 = str -> str.length() == 3;
        CheckLenght ch3 = str -> str.length() == 9;
        TransformString tr1 = str -> str = str.toUpperCase();
        TransformString tr2 = str -> str = str.toLowerCase();
        TransformString tr3 = str -> str = "*************";

        t.print(sentence, chl, tr1);
        t.print(sentence, ch2, tr2);
        t.print(sentence, ch3, tr3);
        t.print(sentence, ch3, tr1);
        t.print(sentence, ch3, tr2);
    }
}










