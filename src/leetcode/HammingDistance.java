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
public class HammingDistance {

    public static void main(String[] args) {
        System.out.println("" + hammingDistance(1501377268, 258791155));
    }

    public static int hammingDistance(int x, int y) {
        int res = 0;
        String sX = getBinaryFromInt(x);
        String sY = getBinaryFromInt(y);
        if (sX.length() != sY.length()) {
            if (sX.length() > sY.length()) {
                while (sX.length() > sY.length()) {
                    sY = "0" + sY;
                }

            } else {
                while (sY.length() > sX.length()) {
                    sX = "0" + sX;
                }

            }
        }
        for (int i = 0; i < sX.length(); i++) {
            if (sX.charAt(i) != sY.charAt(i)) {
                res++;
            }
        }
        return res;
    }

    public static String getBinaryFromInt(int i) {
        String res = "";
        while (i > 1) {
            res = i % 2 + res;
            i = i / 2;
        }
        res = i + res;
        return res;
    }
}
