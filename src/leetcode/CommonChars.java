/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Alex
 */
public class CommonChars {

    public static void main(String[] args) {
        List<String> list = commonChars(new String[]{"bella", "label", "roller"});
        for(String s : list){
            System.out.println("" + s);
        }
    }

    public static List<String> commonChars(String[] A) {
        List<String> result = new ArrayList<>();
        Map<Character, Integer[]> charsSeen = new HashMap<>();
        for (String s : A) {
            Map<Character, Integer> charsInWord = new HashMap<>();
            for (char c : s.toCharArray()) {
                charsInWord.put(c, charsInWord.containsKey(c) ? charsInWord.get(c) +1 : 1);
            }
            for (Character c : charsInWord.keySet()) {
                Integer[] timesSeen = charsSeen.get(c);
                if (timesSeen == null) {
                    timesSeen = new Integer[2];
                    timesSeen[0] = charsInWord.get(c);
                    timesSeen[1] = 1;
                } else {
                    if (timesSeen[0] > charsInWord.get(c)) {
                        timesSeen[0] = charsInWord.get(c);
                    }
                    timesSeen[1]++;
                }
                charsSeen.put(c, timesSeen);

            }
        }
        for (Character c : charsSeen.keySet()) {
            if (charsSeen.get(c)[1] == A.length) {
                for (int i = 0; i < charsSeen.get(c)[0]; i++) {
                    result.add(""+c);
                }
            }
        }

        return result;
    }
}
