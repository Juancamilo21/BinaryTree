package implementsbinarytree;

public class Tree {

    private Node root;

    public Tree() {
        root = null;
    }

    public Node getRoot() {
        return root;
    }

    public boolean isEmpty() {
        return (getRoot() == null);
    }

    public void add(int number) {
        if (isEmpty()) {
            root = new Node(number);
        } else root.insert(number);
    }

    public void preorder(Node node) {
        if (node != null) {
            System.out.print(node.getNumber() + " - ");
            preorder(node.getLeft());
            preorder(node.getRight());
        }
    }

    public void inorder(Node node) {
        if (node != null) {
            inorder(node.getLeft());
            System.out.print(node.getNumber() + " - ");
            inorder(node.getRight());
        }
    }

    public void postorder(Node node) {
        if (node != null) {
            postorder(node.getLeft());
            postorder(node.getRight());
            System.out.print(node.getNumber() + " - ");
        }
    }
}
