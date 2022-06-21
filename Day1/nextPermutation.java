// Problem Statement: Given an array Arr[] of integers, rearrange the numbers of the given array into the lexicographically 
// next greater permutation of numbers.

// If such an arrangement is not possible, it must rearrange it as the lowest possible order (i.e., sorted in ascending order).

// Example 1 :

// Input format: Arr[] = {1,3,2}

// Output: Arr[] = {2,1,3}

// Explanation: All permutations of {1,2,3} are {{1,2,3} , {1,3,2}, {2,13} , {2,3,1} , {3,1,2} , {3,2,1}}. 
// So, the next permutation just after {1,3,2} is {2,1,3}.


class Solution {
    public void nextPermutation(int[] nums) {
        
        if(nums.length==1) return;
        
        int i = nums.length-2;
        
        while(i >= 0 && nums[i] >= nums[i+1]) i--;
        
        
        if(i>=0){
            int j= nums.length-1;
            while(j>=0 && nums[j] <= nums[i])j--;
            
            swap(nums,i,j);
        }
        
        reverse(nums,i+1, nums.length-1);
        
        
       
    }
    
    
    public void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    
    public void reverse(int[] nums, int i, int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
