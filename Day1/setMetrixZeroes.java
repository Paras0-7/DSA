//Problem Statement: Given a matrix if an element in the matrix is 0 then you will have to set its entire column and 
// row to 0 and then return the matrix.
//
//       
//
//        Examples 1:
//
//        Input: matrix={{1,1,1],[1,0,1],[1,1,1]]
//
//        Output: {{1,0,1],[0,0,0],[1,0,1]]

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};

        int rows = matrix.length;
        int cols = matrix[0].length;

        int dummy1[] = new int[rows];
        int dummy2[] = new int[cols];
        Arrays.fill(dummy1,-1);
        Arrays.fill(dummy2,-1);
        for(int i=0;i<rows;i++){
            for(int j = 0; j<cols;j++){
                if(matrix[i][j]==0){
                    dummy1[i]=0;
                    dummy2[j]=0;
                }
            }
        }

        for(int i=0;i<rows;i++){
            for(int j = 0; j<cols;j++){
                if(dummy1[i]==0 || dummy2[j]==0){
                    matrix[i][j]=0;

                }
            }
        }

        for(int i=0;i<rows;i++){
            for(int j = 0; j<cols;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}