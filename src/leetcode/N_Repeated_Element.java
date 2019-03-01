

package leetcode;

import java.util.HashMap;


public class N_Repeated_Element {
    
    public static void main(String[] args){
        
        int[] A = {1,2,1,3,1,4,1,5};
        System.out.println("" + repeatedNTimes(A));
    }
    
    public static int repeatedNTimes(int[] A) {
        int n = A.length/2;
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(Integer a : A){
            map.put(a, (map.get(a)!=null)?map.get(a) +1:1);
            if(map.get(a)==n){
                return a;
            }
        }
        return -1;
    }
}
