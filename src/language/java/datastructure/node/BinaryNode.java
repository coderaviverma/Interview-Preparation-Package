package language.java.datastructure.node;

public class BinaryNode {
    public int value;
    public int height;
    public BinaryNode left;
    public BinaryNode right;

    public BinaryNode(int value) {
        this.value = value;
    }

    public int getHeight() {
        return height;
    }//end of method

    public void setHeight(int height) {
        this.height = height;
    }//end of method

    public int getValue() {
        return value;
    }//end of method

    public void setValue(int value) {
        this.value = value;
    }//end of method

    public BinaryNode getLeft() {
        return left;
    }//end of method

    public void setLeft(BinaryNode left) {
        this.left = left;
    }//end of method

    public BinaryNode getRight() {
        return right;
    }//end of method

    public void setRight(BinaryNode right) {
        this.right = right;
    }//end of method

    @Override
    public String toString() {
        return value + "";
    }//end of method

}
