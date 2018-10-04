package stack;

/**
 * @author taleko01
 */

public class StackOperations {
	
	public static void main(String[] args) {
		BasicStack stack = StackUtils.buildStack();
		System.out.println(stack.getTop());
		while (stack.getTop()!=null) {
			stack.pop();
			System.out.println(stack.getTop());
		}
	}
}
