package tree;

/**
 * @author taleko01
 */

public class TreeOperations {
	
	public static void main(String[] args) {
		TreeNode treeRoot = TreeUtils.buildTree();
		System.out.println("In order");
		TreeUtils.traverseInOrder(treeRoot);
		System.out.println("Pre order");
		TreeUtils.traversePreOrder(treeRoot);
		System.out.println("Post order");
		TreeUtils.traversePostOrder(treeRoot);
	}
}
