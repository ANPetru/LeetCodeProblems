package leetcode;

import java.util.ArrayList;

public class SortArrayByParity {

    public static void main(String[] args) {
        int[] A = {3,1,2,4};
        System.out.println("" + sortArrayByParity(A)[0]);
    }

    public static int[] sortArrayByParity(int[] A) {
        ArrayList<Integer>even = new ArrayList<Integer>();
        ArrayList<Integer>odd = new ArrayList<Integer>();
        for(Integer a : A){
            if(a%2==0){
                even.add(a);
            } else {
                odd.add(a);
            }
        }
        int[] sorted = new int[A.length];
        int iE = 0;
        int iO= 0;
        int i=0;
        while(i<sorted.length){
            if(iE<even.size()){
                sorted[i] = even.get(iE);
                iE++;
            } else{
                sorted[i] = odd.get(iO);
                iO++;
            }
            i++;
        }
        return sorted;
    }
}
