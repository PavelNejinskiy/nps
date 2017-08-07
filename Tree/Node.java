package Tree;

/**
 * Created by pavel on 04/08/2017.
 */
public class Node {
    private int key;
    private int value;
    private Node left;
    private Node right;
    private Node parent;

    public Node(int key, int value, Node parent) {
        this.key = key;
        this.value = value;
        this.parent = parent;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
}