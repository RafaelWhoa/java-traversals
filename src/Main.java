import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Traversals<Integer> traversals = new Traversals<>();

        TreeNode<Integer> node1 = new TreeNode<>(50);
        TreeNode<Integer> node2 = new TreeNode<>(25);
        TreeNode<Integer> node3 = new TreeNode<>(100);
        TreeNode<Integer> node4 = new TreeNode<>(10);
        TreeNode<Integer> node5 = new TreeNode<>(75);
        TreeNode<Integer> node6 = new TreeNode<>(125);
        TreeNode<Integer> node7 = new TreeNode<>(110);
        node1.setLeft(node2);
        node1.setRight(node3);
        node2.setLeft(node4);
        node3.setLeft(node5);
        node3.setRight(node6);
        node6.setLeft(node7);

        List<Integer> preOrderList;
        List<Integer> inorderList;
        List<Integer> postOrderList;

        System.out.println("Pre-order list:");

        preOrderList = traversals.preorder(node1);
        inorderList = traversals.inorder(node1);

        for (Integer n: preOrderList
        ) {
            System.out.println(n);
        }

        System.out.println("------------------");

        System.out.println("Inorder list:");

        for (Integer n: inorderList
             ) {
            System.out.println(n);
        }
    }
}