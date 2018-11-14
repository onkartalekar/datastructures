package tree;

/**
 * @author taleko01
 */

public class TreeTraversalRecursive {
	
	public static TreeNode buildTree() {
		TreeNode root = new TreeNode(10);
		
		addNode(root, 6);
		addNode(root, 16);
		addNode(root, 3);
		addNode(root, 8);
		addNode(root, 9);
		addNode(root, 19);
		addNode(root, 15);
		
		return root;
	}
	
	private static void addNode(TreeNode root, int data) {
		while (true) {
			if (data > root.getData()) {
				if (root.getRight() == null) {
					root.setRight(new TreeNode(data));
					break;
				} else {
					root = root.getRight();
				}

			} else {
				if (root.getLeft() == null) {
					root.setLeft(new TreeNode(data));
					break;
				} else {
					root = root.getLeft();
				}
			}
		}
	}
	
	static void traverseInOrder(TreeNode root) {
		if (root != null) {
			traverseInOrder(root.getLeft());
			System.out.println(root.getData());
			traverseInOrder(root.getRight());
		}
	}
	
	static void traversePreOrder(TreeNode root) {
		if (root != null) {
			System.out.println(root.getData());
			traversePreOrder(root.getLeft());
			traversePreOrder(root.getRight());
		}
	}
	
	static void traversePostOrder(TreeNode root) {
		if (root != null) {
			traversePostOrder(root.getLeft());
			traversePostOrder(root.getRight());
			System.out.println(root.getData());
		}
		
	}
}
