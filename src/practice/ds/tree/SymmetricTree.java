package practice.ds.tree;

public class SymmetricTree {

//https://leetcode.com/problems/symmetric-tree/submissions/
    public static void main(String[] args) {



    }
    public boolean isSymmetric(TreeNode root) {
        return  isMirror(root.left,root.right);
    }


    public boolean isMirror(TreeNode right, TreeNode left){

        if(right==null && left== null) return true;

        if(right != null && left!=null && right.val == left.val){
            return isMirror(right.left,left.right) &&  isMirror(right.right,left.left);
        }
        return false;
    }

}
