

public class ToUpperCaseTransformer extends AbstractTransformer {

    @Override
    public boolean checkLenght(String str) {
        return str.length() == 3;
    }

    @Override
    public String transformString(String str) {
        return str.toUpperCase();
    }
}
