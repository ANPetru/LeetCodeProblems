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
public class RobotReturnToOrigin {
    public static void main(String[] args){
        System.out.println("" + judgeCircle("LR"));
    }
    
    public static boolean judgeCircle(String moves) {
        if(moves.length()==0 || moves.length()%2!=0) return false;
        int mH = 0;
        int mV = 0;
        for(char c : moves.toCharArray()){
            switch(c){
                case 'U':
                    mV++;
                    break;
                case 'D':
                    mV--;
                    break;
                case 'L':
                    mH--;
                    break;
                case 'R':
                    mH++;
                    break;
            }
        }
        return (mH==0 && mV==0);
    }
}
