// Program to transpose a matrix
//      1 2 3       1 4 7
//      4 5 6       2 5 8
//      7 8 9       3 6 9
// [[1, 2, 3], [4, 5, 6], [7, 8, 9]] => [[1, 4, 7], [2, 5, 8], [3, 6, 9]]
package arrays;

import java.util.Arrays;

public class TransposeOfMatrix {
    static void solution(int[][] matrix){
        if(matrix.length==0||matrix.length!=matrix[0].length)
            System.out.println("Not a valid matrix");
        else{
            for (int i=0;i<matrix.length;i++){
                for (int j=i;j<matrix[0].length;j++){      //Important j=i for transpose or else it will not work
                    int temp = matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
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
