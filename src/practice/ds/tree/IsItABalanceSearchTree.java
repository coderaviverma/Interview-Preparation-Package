package practice.ds.tree;


public class IsItABalanceSearchTree {


    public static void main(String[] args) {

        TreeNode treeNode=TreeNode.getFilledTree();
        System.out.println(isBST(treeNode));
    }


    public static boolean isBST(TreeNode node) {
        return isBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean isBST(TreeNode node, int min, int max) {
        if (node == null) return true;

        if (node.val<min || node.val>max) return false;

        return isBST(node.left,min,node.val) && isBST(node.right, node.val+1,max);
    }


}
