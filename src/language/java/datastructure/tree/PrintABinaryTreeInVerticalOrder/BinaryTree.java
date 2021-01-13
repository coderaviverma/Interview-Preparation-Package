package language.java.datastructure.tree.PrintABinaryTreeInVerticalOrder;

import java.util.Stack;

public class BinaryTree {

    /*Print a Binary Tree in Vertical Order
    *
    *     1
        /    \
       2      3
      / \    / \
     4   5  6   7
             \   \
              8   9


    The output of print this language.java.datastructure.tree vertically will be:
    4
    2
    1 5 6
    3 8
    7
    9

    *
    *
    * */

    Node root;

    Values values=new Values();


//    void findMinMax()

    public static void main(String[] args) {


        for (int i = -4; i < 0; i++) {

            System.out.println(i);
        }


        Stack stack=new Stack();


    }
}


class Node{

    Node right,left;
    int data;

    public Node(int data) {
        this.left = this.right=null;
        this.data = data;
    }
}

class Values{

    int min,max;

}

