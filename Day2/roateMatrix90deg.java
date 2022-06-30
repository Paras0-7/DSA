// You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

// You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. 
// DO NOT allocate another 2D matrix and do the rotation.

class Solution {
    public void rotate(int[][] arr) {
        
        
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[i].length;j++){
                 int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            int k=0;int j = arr[i].length-1;
            
            while(k<j){
                 int temp = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp;
                k++;
                j--;
            }
        }
    }
}