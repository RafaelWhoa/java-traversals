public class Main {
    public static void main(String[] args) {

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


    }
}