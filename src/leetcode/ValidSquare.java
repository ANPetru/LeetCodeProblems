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
public class ValidSquare {

    public static void main(String[] args) {
        int[] p1 = {0, 0};
        int[] p2 = {1, 1};
        int[] p3 = {1, 0};
        int[] p4 = {0, 1};
        System.out.println("" + validSquare(p1, p2, p3, p4));

    }

    public static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        double dist1 = distanceBetweenPoints(p1, p2);
        double dist2 = distanceBetweenPoints(p3, p4);
        double dist3 = distanceBetweenPoints(p1, p3);
        double dist4 = distanceBetweenPoints(p3, p2);
        return  dist1 == dist2 && dist3 == dist4;
    }
    
    public static double distanceBetweenPoints(int[] p1, int[] p2){
        double c1 = Math.pow(Math.abs(p1[1] - p2[1]), 2);
        double c2 = Math.pow(Math.abs(p1[0] - p2[0]), 2);
        if(c1==1 && c2 == 1 && p1[0]==p2[0]&&p1[1]==p2[1]){
            return 1;
        }
        return Math.sqrt(c1 + c2);
    }
}
