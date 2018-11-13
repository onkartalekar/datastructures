package tree;

import common.Node;

import java.util.Stack;

/**
 * Created by taleko01 on 11/13/2018
 */

public class TreeTraversalIterative {

    static void traverseInOrder(TreeNode root) {
        Stack<TreeNode> nodeStack = new Stack<>();
        while (!nodeStack.isEmpty() || root != null) {
            if (root != null) {
                nodeStack.push(root);
                root = root.getLeft();
            } else {
                root = nodeStack.pop();
                System.out.println(root.getData());
                root = root.getRight();
            }
        }
    }

    static void traversePreOrder(TreeNode root) {

    }

    static void traversePostOrder(TreeNode root) {

    }
}
