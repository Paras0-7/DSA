// Problem Statement: Given an array consisting of only 0s, 1s and 2s. Write a program to in-place sort the array without using 
// inbuilt sort functions. ( Expected: Single pass-O(N) and constant space)

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]

// Input: nums = [2,0,1]
// Output: [0,1,2]

class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        
        
        while(mid<=high){
            if(nums[mid]==0){   //2
                swap(nums,mid,low);
                mid++;low++;
            }
            
            else if(nums[mid]==1) mid++;
            
            else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
        }
              
    }
    
    public void swap(int[] nums, int i , int j){
                int temp = nums[i];
                nums[i]= nums[j];
                nums[j] = temp;
    }
}