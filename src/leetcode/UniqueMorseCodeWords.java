package leetcode;
import java.util.HashSet;


public class UniqueMorseCodeWords {
    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig" , "msg"};
        System.out.println("" + uniqueMorseRepresentations(words));
    }
    
    public static int uniqueMorseRepresentations(String[] words) {
        String[] alphabet = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> uniqueMorseWords = new HashSet<>();
        for(String word : words){
            String morse = "";
            for(int i = 0;i<word.length();i++){
                int ind = (int)word.charAt(i) - 97;
                System.out.println("" + ind + " " + word.charAt(i));
                morse += alphabet[ind];
            }
            uniqueMorseWords.add(morse);
        }
        return uniqueMorseWords.size();
    }
}




