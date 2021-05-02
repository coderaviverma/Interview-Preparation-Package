package company.airtel;

public class MaximumDifferenceBetweenNodeAncestor {

    int result =0;
    public int maxAncestorDiff(TreeNode root) {

        dfs(root,root.val,root.val);
        return result;
    }

    void dfs(TreeNode root, int prevMin,int prevMax) {

        if (root == null) return;

        result = Math.max(result, Math.max(Math.abs(root.val - prevMin), Math.abs(root.val - prevMax)));
        prevMin = Math.min(prevMin, root.val);
        prevMax = Math.max(prevMax, root.val);

        dfs(root.left, prevMin, prevMax);
        dfs(root.right, prevMin, prevMax);
    }
}
