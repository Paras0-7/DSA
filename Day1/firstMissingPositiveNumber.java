// Given an unsorted integer array nums, return the smallest missing positive integer.

// You must implement an algorithm that runs in O(n) time and uses constant extra space.

class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int n = nums.length;
        
        if(n == 1){
            if(nums[0]!=1)
                 return 1;
            return 2;
        }
        
        int i = 0;
        while(i<n){
            int correctIndex = nums[i]-1;
            
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i]!=nums[correctIndex] ){
                int temp = nums[i];
                
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else{
                i++;
            }
        }
        
        
        for(i = 0;i<n;i++){
            if(nums[i]!=i+1) return i+1;
        }


        return n+1;
    }
}
