public class ToStars extends  AbstractTransformer  {


    @Override
    public boolean checkLenght(String str) {
        return str.length() == 10;
    }

    @Override
    public String transformString(String str) {
        str = "**********";
        return str;
    }
}
