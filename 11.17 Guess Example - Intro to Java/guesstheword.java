/**
 * This class contains methods to modify and display words.
 */
public class guesstheword {

    /**
     * @param ch
     * @param word
     */
    public static void modifyStarWord(char ch, String word, StringBuilder starWord){
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                starWord.setCharAt(i, ch);
            } 
        }

    }

    public static void main(String[] args) {
        String word = "GEOLOGY";
        StringBuilder starWord = new StringBuilder("**O*O*Y");
        char guess = 'G';
        modifyStarWord(guess, word, starWord);
        System.out.print(starWord);
    }
}