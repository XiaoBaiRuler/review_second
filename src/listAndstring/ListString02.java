package listAndstring;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

/**
 * @Author xiaobai
 * @Date 2021/1/28 18:16
 * @Version 1.0
 */
public class ListString02 {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        int[][] matrix2 = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        setZeroes(matrix1);
        System.out.println(Arrays.deepToString(matrix1));
    }

    /**
     * 额外记录标记为0的索引
     * @param matrix int[][]
     */
    public static void setZeroes(int[][] matrix) {
        if (matrix != null){
            Stack<String> map = new Stack<>();
            for (int i = 0; i < matrix.length; i ++) {
                for (int j = 0; j < matrix[i].length ; j++) {
                    if (matrix[i][j] == 0){
                        map.push( i + "#" + j);
                        for (int l = 0; l < i ; l++) {
                            matrix[l][j] = 0;
                        }
                        for (int l = 0; l < j; l++) {
                            matrix[i][l] = 0;
                        }
                    }
                }
            }
            while (!map.isEmpty()){
                String[] strs = map.pop().split("#");
                int i = Integer.parseInt(strs[0]);
                int j = Integer.parseInt(strs[1]);
                for (int k = i; k < matrix.length; k++) {
                    matrix[k][j] = 0;
                }
                for (int k = j; k < matrix[i].length; k++) {
                    matrix[i][k] = 0;
                }
            }
        }
    }

    /**
     * 暴力法: 空间复杂度为O(1): 标记0: 需要重复遍历两次
     * @param matrix int[][]
     */
    public void setZeroesChange(int[][] matrix) {
        int MODIFIED = -1000000;
        int R = matrix.length;
        int C = matrix[0].length;

        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                if (matrix[r][c] == 0) {
                    // We modify the corresponding rows and column elements in place.
                    // Note, we only change the non zeroes to MODIFIED
                    for (int k = 0; k < C; k++) {
                        if (matrix[r][k] != 0) {
                            matrix[r][k] = MODIFIED;
                        }
                    }
                    for (int k = 0; k < R; k++) {
                        if (matrix[k][c] != 0) {
                            matrix[k][c] = MODIFIED;
                        }
                    }
                }
            }
        }

        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                // Make a second pass and change all MODIFIED elements to 0 """
                if (matrix[r][c] == MODIFIED) {
                    matrix[r][c] = 0;
                }
            }
        }
    }

}
