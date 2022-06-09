//Program to rotate a matrix by 90 degree
//      1 2 3       7 4 1
//      4 5 6       8 5 2
//      7 8 9       9 6 3
//{[1,2,3],[4,5,6],[7,8,9]} => {[7,4,1],[8,5,2],[9,6,3]}
package arrays;

import java.util.Arrays;

public class RotateMatrixBy90Degree {
    static void solution(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length)
            System.out.println("Not a valid matrix");
        else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = i; j < matrix[0].length; j++) {      //Important j=i for transpose or else it will not work
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            for(int i=0;i<matrix.length;i++){
                int li=0;
                int ri= matrix.length-1;
                while(li<ri){
                    int temp = matrix[i][li];
                    matrix[i][li]=matrix[i][ri];
                    matrix[i][ri]=temp;
                    li++;
                    ri--;
                }
            }
            System.out.println(Arrays.deepToString(matrix));
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        solution(matrix);
    }
}
