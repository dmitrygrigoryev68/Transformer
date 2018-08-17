
public class AppTransformer {

    public static void main(String[] args) {



        String sentence  = "Ajsh jFTd =yf &&& LLL   #$5678N psl 9r8e sk tyf *UGHF 2cn 876 vbhgfdrtfd  ";
        String sentence1 = "Ajsh jFTd =yf &&& LLLd   #$5678N psl 9r8e sk tyf *UGHF 2cn 876 vbhgfdrtfd  ";


        AbstractTransformer trans = new ToUpperCaseTransformer();

        AbstractTransformer trans1 = new ToLowerCaseTransformer();

        Transform t = new Transform();

        System.out.println(t.transform(sentence,trans1));



       // System.out.println(trans.transformString(sentence));


      //   System.out.println(trans1.transformString(sentence));

    }
}