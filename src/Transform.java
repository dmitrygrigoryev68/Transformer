public class Transform {

        public String transform(String sentence, int numOfChar) {
            String worlds[] = sentence.split(" ");
            String finalString = "";
            for (int i = 0; i < worlds.length; i++) {
                if ((worlds[i].length() == numOfChar)&&(checkSymbols(worlds[i]))) {
                    finalString = finalString + " " + worlds[i].toUpperCase();
                }
            }
            if (finalString == "")
               {finalString = "No result";}
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
