package practice.ds.tree;

public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }


      public static TreeNode getFilledBSTTree(){
          TreeNode treeNode=new TreeNode(5);
          treeNode.left=new TreeNode(2);
          treeNode.left.left=new TreeNode(1);
          treeNode.left.right=new TreeNode(3);
          treeNode.right=new TreeNode(7);
          treeNode.right.left=new TreeNode(6);
          treeNode.right.right=new TreeNode(8);

          return treeNode;
      }

    public static TreeNode getFilledTree(){
        TreeNode treeNode=new TreeNode(1);
        treeNode.left=new TreeNode(2);
        treeNode.left.left=new TreeNode(3);
        treeNode.left.right=new TreeNode(4);
        treeNode.right=new TreeNode(5);
        treeNode.right.left=new TreeNode(6);
        treeNode.right.right=new TreeNode(8);

        return treeNode;
    }

  }