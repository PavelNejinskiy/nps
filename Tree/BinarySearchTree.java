package Tree;

public class BinarySearchTree {
    Node root;

    Node search(Node target, int key) {
        if (target == null || target.getKey() == key) {
            return target;
        }
        if (key < target.getKey()) {
            return search(target.getLeft(), key);
        } else {
            return search(target.getRight(), key);
        }
    }

    /**
     * Find a node with specified key
     *
     * @param key
     * @return
     */
    public Node search(int key) {
        return search(root, key);
    }

    Node insert(Node target, Node parent, int key, int value) {
        if (target == null) {
            target = new Node(key, value, parent);
        } else {
            if (key < target.getKey()) {
                target.setLeft(insert(target.getLeft(), target, key, value));
            } else {
                target.setRight(insert(target.getRight(), target, key, value));
            }
        }
        return target;
    }

    public void insert(int key, int value) {
        root = insert(root, null, key, value);
    }

    /**
     * replace one node with another.
     *
     * @param target node to be repalaced
     * @param value
     */
    void replace(Node target, Node value) {
        if (target.getParent() == null) {
            root = value;
        } else if (target == target.getParent().getLeft()) {
            target.getParent().setLeft(value);
        } else {
            target.getParent().setRight(value);
        }
        if (value != null) {
            value.setRight(target.getParent());
        }
    }

    void remove(Node target, int key) {
        if (target == null) {
            return;
        }

        if (key < target.getKey()) {
            remove(target.getLeft(), key);
        } else if (key > target.getKey()) {
            remove(target.getRight(), key);
        } else if (target.getLeft() != null && target.getRight() != null) {
            Node rightNode = target.getRight();
            while (rightNode.getLeft() != null) {
                rightNode = rightNode.getLeft();
            }
            target.setKey(rightNode.getKey());
            target.setValue(rightNode.getValue());
            replace(rightNode, rightNode.getRight());
        } else if (target.getLeft() != null) {
            replace(target, target.getLeft());
        } else if (target.getRight() != null) {
            replace(target, target.getRight());
        } else {
            replace(target, null);
        }
    }

    public void remove(int key) {
        remove(root, key);
    }

    void print(Node target) {
        if (target != null) {
            print(target.getLeft());
            System.out.print(target.getKey() + ":" + target.getValue() + " ");
            print(target.getRight());
        }
    }

    public void print() {
        print(root);
        System.out.println();
    }
}