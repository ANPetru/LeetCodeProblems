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
public class SumEvenNumberQueries {
     public static void main(String[] args) {
        int[] nums = {-1,4,2,3};
        int[][] queries = {{1,0},{-3,1},{-1,2}};
        int[] result = sumEvenAfterQueries(nums, queries);
        for(int i : result){
            System.out.println("" +i);
        }
    }

    public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] result = new int[queries.length];
        for(int i = 0;i<queries.length;i++){
            int ind = queries[i][1];
            int val = queries[i][0];
            A[ind] = A[ind] + val;
            result[i] = 0;
            for(int j = 0;j<A.length;j++){
                result[i] += A[j]%2==0?A[j]:0;
            }
        }
        return result;
    }
    
}
