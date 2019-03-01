/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Alex
 */
public class SquareSortedArray {

    public static void main(String[] args) {
        int[] A = {-3, -1, 2, 3, 4};
        System.out.println("" + sortedSquares(A));
    }

    public static int[] sortedSquares(int[] A) {
        ArrayList<Integer> squares = new ArrayList<Integer>();
        for (Integer a : A) {
            squares.add(a * a);
        }
        Collections.sort(squares);
        int[] sortedS = new int[A.length];
        for (int i = 0; i < squares.size(); i++) {
            sortedS[i] = squares.get(i);
        }

        return sortedS;
    }
}
