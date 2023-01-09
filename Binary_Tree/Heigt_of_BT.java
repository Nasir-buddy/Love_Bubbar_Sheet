package Binary_Tree;

class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        // code here 
        if(node == null){
            return 0;
        }
        int smallLeftOutput = height(node.left);
        int smallRightOutput = height(node.right);
        
        // if(smallLeftOutput > smallRightOutput){
        //     return smallLeftOutput + 1;
        // } else {
        //     return smallRightOutput + 1;
        // }
        return Math.max(smallLeftOutput , smallRightOutput) + 1;
    }
}


