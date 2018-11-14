package stack;

/**
 * @author taleko01
 */

public class StackUtils {
	
	public static BasicStack buildStack(){
		BasicStack stack = new BasicStack();
		
		stack.push(6);
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		return stack;
	}
}
