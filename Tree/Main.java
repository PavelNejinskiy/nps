package Tree;

/**
 * Created by pavel on 04/08/2017.
 */
public class Main {

    // Usage example
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(3, 1);
        tree.insert(2, 2);
        tree.insert(4, 5);
        tree.print();

        System.out.println(tree.getClass());

        tree.remove(2);
        tree.remove(3);
        tree.print();
        tree.remove(4);
    }
}

