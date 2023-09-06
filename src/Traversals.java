import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Your implementation of the pre-order, in-order, and post-order
 * traversals of a tree.
 */
public class Traversals<T extends Comparable<? super T>> {

    /**
     * DO NOT ADD ANY GLOBAL VARIABLES!
     */

    /**
     * Given the root of a binary search tree, generate a
     * pre-order traversal of the tree. The original tree
     * should not be modified in any way.
     *
     * This must be done recursively.
     *
     * Must be O(n).
     *
     * @param <T> Generic type.
     * @param root The root of a BST.
     * @return List containing the pre-order traversal of the tree.
     */
    public List<T> preorder(TreeNode<T> root) {
        List<T> traverseList = new ArrayList<>();
        preOrderR(root, traverseList);
        return traverseList;
    }

    /**
     * Given the root of a binary search tree, generate an
     * in-order traversal of the tree. The original tree
     * should not be modified in any way.
     *
     * This must be done recursively.
     *
     * Must be O(n).
     *
     * @param <T> Generic type.
     * @param root The root of a BST.
     * @return List containing the in-order traversal of the tree.
     */
    public List<T> inorder(TreeNode<T> root) {
        List<T> traverseList = new ArrayList<>();
        inorderR(root, traverseList);
        return traverseList;
    }

    /**
     * Given the root of a binary search tree, generate a
     * post-order traversal of the tree. The original tree
     * should not be modified in any way.
     *
     * This must be done recursively.
     *
     * Must be O(n).
     *
     * @param <T> Generic type.
     * @param root The root of a BST.
     * @return List containing the post-order traversal of the tree.
     */
    public List<T> postorder(TreeNode<T> root) {
        List<T> traverseList = new ArrayList<>();
        postOrderR(root, traverseList);
        return traverseList;
    }

    /**
     * Given the current node and traverseList to save pre-order list,
     * traverse all the Binary Search Tree recursively.
     * <p/>
     * O(n) function.
     *
     * @param <T> Generic type.
     * @param node The current node.
     * @param traverseList The list to save pre-order elements.
     */
    private void preOrderR(TreeNode<T> node, List<T> traverseList){
        if (node != null){
            //System.out.println(node.getData());
            traverseList.add(node.getData());
            preOrderR(node.getLeft(), traverseList);
            preOrderR(node.getRight(), traverseList);
        }
    }

    /**
     * Given the current node and traverseList to save in-order list,
     * traverse all the Binary Search Tree recursively.
     * <p/>
     * O(n) function.
     *
     * @param <T> Generic type.
     * @param node The current node.
     * @param traverseList The list to save in-order elements.
     */
    private void inorderR(TreeNode<T> node, List<T> traverseList){
        if (node != null){
            inorderR(node.getLeft(), traverseList);
            //System.out.println(node.getData());
            traverseList.add(node.getData());
            inorderR(node.getRight(), traverseList);
        }
    }

    /**
     * Given the current node and traverseList to save post-order list,
     * traverse all the Binary Search Tree recursively.
     * <p/>
     * O(n) function.
     *
     * @param <T> Generic type.
     * @param node The current node.
     * @param traverseList The list to save post-order elements.
     */
    private void postOrderR(TreeNode<T> node, List<T> traverseList){
        if(node != null){
            postOrderR(node.getLeft(), traverseList);
            postOrderR(node.getRight(), traverseList);
            traverseList.add(node.getData());
        }
    }
}