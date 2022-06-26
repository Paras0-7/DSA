// A binary tree is uni-valued if every node in the tree has the same value.

// Given the root of a binary tree, return true if the given tree is uni-valued, or false otherwise.

class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return false;
        int x = root.val;
        return inOrder(root.left,x)  && inOrder(root.right,x) ;
    
    }
    
    public boolean inOrder(TreeNode node,int x){
        if(node==null)  return true;
        // System.out.println("Val :" + node.val +" x : " +x);
        if(node.val!=x){
            // System.out.println("Val :" + node.val +" x : " +x);
            return false;
        }
        
        return inOrder(node.left,x ) && inOrder(node.right,x);
        
        
        
    }
}