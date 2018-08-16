public class Transform {

        public String transform(String sentence, AbstractTransformer transformer) {
            String words[] = sentence.split(" ");
            String finalString = "";
                for (int i = 0; i < words.length; i++) {
                if ((transformer.checkLenght(words[i])) && (checkSymbols(words[i]))) {
                    words[i] = transformer.transformString(words[i]);
                }
            }
            if (finalString.equals("")) {
                finalString = "No result";
            }
            return finalString;
        }

        private boolean checkSymbols(String words) {
            char ch;
            for (int i = 0; i < words.length(); i++) {
                ch = words.charAt(i);
                if (((ch < 'a')||(ch > 'z'))&&((ch < 'A')||(ch > 'Z'))) {
                    return false;
                }
            }
            return true;
        }

}
