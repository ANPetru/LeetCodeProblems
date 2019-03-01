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
public class FlippingAnImage {

    public static void main(String[] args) {
        int[][] image = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        image = flipAndInvertImage(image);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length; j++) {
                System.out.print("" + image[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] flipAndInvertImage(int[][] A) {
        //int[][] result = new int[A.length][A[0].length];
        /*for(int i = 0; i<A.length;i++){
            for(int j = 0;j<A[i].length;j++){
                result[i][A[i].length-1-j] = (A[i][j]==0)?1:0;
            }
        }*/
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < ((A[i].length%2!=0)?A[i].length:A[i].length/2); j++) {
                if (A[i].length - 1 - j >= A[i].length) {
                    break;
                }
                int temp = A[i][A[i].length - 1 - j];
                A[i][A[i].length - 1 - j] = (A[i][j] == 0) ? 1 : 0;
                A[i][j] = (temp == 0) ? 1 : 0;
                if (A[i].length - 1 - j <= j) {
                    break;
                }
            }
        }
        return A;

    }
}
