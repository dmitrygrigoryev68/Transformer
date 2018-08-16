
public class AppTransformer {

    public static void main(String[] args) {



        String sentence  = "Ajsh jFTd =yf &&& LLLd   #$5678N psl 9r8e sk tyf *UGHF 2cn 876 vbhgfdrtfd  ";
        String sentence1 = "Ajsh jFTd =yf &&& LLLd   #$5678N psl 9r8e sk tyf *UGHF 2cn 876 vbhgfdrtfd  ";


        AbstractTransformer transformer = new ToUpperCaseTransformer();

        AbstractTransformer transformer1 = new ToLowerCaseTransformer();


        System.out.println(transformer.transformString(sentence));
        System.out.println(transformer1.transformString(sentence));

    }
}