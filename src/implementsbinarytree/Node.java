package implementsbinarytree;

public class Node {

    private int number;
    private Node left;
    private Node right;

    public Node(int _number) {
        number = _number;
        left = null;
        right = null;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void insert(int _number) { // Method for insert nodes in the tree
        if (_number < number) {
            if (left == null) { // inserts the data to the left of the tree
                left = new Node(_number);
            } else left.insert(_number);
        } else {
            if (right == null) { // inserts the data to the right of the tree
                right = new Node(_number);
            } else right.insert(_number);
        }
    }
}
