package tree;

/**
 * @author taleko01
 */

public class TreeOperations {

    public static void main(String[] args) {
        TreeNode treeRoot = TreeTraversalRecursive.buildTree();

        System.out.println("----------- Recursive -----------");

        System.out.println("In order");
        TreeTraversalRecursive.traverseInOrder(treeRoot);
        System.out.println("Pre order");
        TreeTraversalRecursive.traversePreOrder(treeRoot);
        System.out.println("Post order");
        TreeTraversalRecursive.traversePostOrder(treeRoot);

        System.out.println("----------- Iterative -----------");
        System.out.println("In order");
        TreeTraversalIterative.traverseInOrder(treeRoot);
    }
}
