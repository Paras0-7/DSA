// dd

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] productLeft = new int[nums.length];
        productLeft[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            productLeft[i] = productLeft[i-1] * nums[i];
            
        }
        
        
        int productRight = 1;
        
        for(int i=nums.length-1;i>0;i--){
            
            productLeft[i] = productLeft[i-1] * productRight;
            productRight *= nums[i];
        }
        
        
        productLeft[0] = productRight;
        return productLeft;
    }
}