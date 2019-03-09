/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Alex
 */
public class Matrix_01 {

    public static void main(String[] args) {
        int[][] matrix = {{0, 0, 1, 0, 1, 1, 1, 0, 1, 1},
        {1, 1, 1, 1, 0, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 0, 0, 0, 1, 1},
        {1, 0, 1, 0, 1, 1, 1, 0, 1, 1},
        {0, 0, 1, 1, 1, 0, 1, 1, 1, 1},
        {1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 0, 1, 0, 1, 0, 1},
        {0, 1, 0, 0, 0, 1, 0, 0, 1, 1},
        {1, 1, 1, 0, 1, 1, 0, 1, 0, 1},
        {1, 0, 1, 1, 1, 0, 1, 1, 1, 0}};
        matrix = updateMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println("");
        }
    }

    public static int[][] updateMatrix(int[][] matrix) {
        ArrayList<Position0> pos0 = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    pos0.add(new Position0(i, j));
                } else {
                    matrix[i][j] = -1;
                }
            }
        }
        boolean exit = false;
        int dist0 = 1;
        while (!exit) {
            exit = true;
            for (int i = 0; i < pos0.size(); i++) {
                Position0 currPos = pos0.get(i);
                if (currPos.x + dist0 < matrix.length && matrix[currPos.x + dist0][currPos.y]
                        < 0) {
                    matrix[currPos.x + dist0][currPos.y] = dist0;
                    exit = false;
                }
                if (currPos.x - dist0 >= 0 && matrix[currPos.x - dist0][currPos.y] < 0) {
                    matrix[currPos.x - dist0][currPos.y] = dist0;
                    exit = false;
                }
                if (currPos.y + dist0 < matrix[0].length && matrix[currPos.x][currPos.y + dist0] < 0) {
                    matrix[currPos.x][currPos.y + dist0] = dist0;
                    exit = false;
                }
                if (currPos.y - dist0 >= 0 && matrix[currPos.x][currPos.y - dist0] < 0) {
                    matrix[currPos.x][currPos.y - dist0] = dist0;
                    exit = false;
                }
            }
            dist0++;
        }
        return matrix;
    }

    private static class Position0 {

        int x;
        int y;

        public Position0(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
