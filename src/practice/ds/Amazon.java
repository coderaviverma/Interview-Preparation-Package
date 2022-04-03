package practice.ds;

import company.airtel.TreeNode;

import java.util.ArrayList;

public class Amazon {

    public static void main(String[] args) {
        ComponenetNode node = new ComponenetNode(10);
        solve(node);
        System.out.println(result);
    }


    private static int result = 0;
    private static Double maxSum = 0.0;

    private static Double solve(ComponenetNode node) {
        if (node == null) return 0.0;

        Double tempSum = 0.0;

        int n = node.nodeArrayList.size();
        for (int i = 0; i < node.nodeArrayList.size(); i++) {
            ComponenetNode tem = node.nodeArrayList.get(i);
            tempSum = tem.value + solve(tem);
            tempSum = tempSum / (n+1);
        }

        if (tempSum > maxSum) {
            result = node.value;
        }
        return tempSum;
    }

    static class ComponenetNode {
        public int value;
        public ArrayList<ComponenetNode> nodeArrayList;

        public ComponenetNode() {
            this.nodeArrayList = new ArrayList<>();
        }

        public ComponenetNode(int value) {
            this.value = value;
            this.nodeArrayList = new ArrayList<>();
        }
    }
}
