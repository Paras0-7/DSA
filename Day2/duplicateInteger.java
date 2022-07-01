// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

// There is only one repeated number in nums, return this repeated number.

// You must solve the problem without modifying the array nums and uses only constant extra space.

class Solution {
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int index = nums[i] > 0 ? nums[i] : nums[i]*-1;
            
            if(nums[index] < 0){
                return index;
            }
            nums[index] = nums[index]*-1;
        }
        
        return -1;
    }
}

