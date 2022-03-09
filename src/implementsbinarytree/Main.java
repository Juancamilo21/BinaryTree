package implementsbinarytree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option, value;
        boolean exit = false;
        Tree tree = new Tree();

        do {
            System.out.println("Select an option");
            System.out.println("1. Add nodes in the tree");
            System.out.println("2. Inorder");
            System.out.println("3. Postorder");
            System.out.println("4. Preorder");
            System.out.println("5. Exit");
            option = sc.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.print("Enter a number:\t");
                    value = sc.nextInt();
                    tree.add(value);
                }
                case 2 -> tree.inorder(tree.getRoot());
                case 3 -> tree.postorder(tree.getRoot());
                case 4 -> tree.preorder(tree.getRoot());
                case 5 -> exit = true;
                default -> System.out.println("Invalid Option");
            }
        } while (!exit);

    }

}
