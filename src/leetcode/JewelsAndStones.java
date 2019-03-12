/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Alex
 */
public class JewelsAndStones {

    public static void main(String[] args) {
        System.out.println("" + numJewelsInStones("Aa", "aaAACDX"));
    }

    public static int numJewelsInStones(String J, String S) {
        int num = 0;
        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < J.length(); j++) {
                if (S.charAt(i) == J.charAt(j)) {
                    num++;
                }
            }
        }
        return num;
    }
}
