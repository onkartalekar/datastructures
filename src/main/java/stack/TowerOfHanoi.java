package stack;

/**
 * @author taleko01
 */

public class TowerOfHanoi {
	
	public static void main(String[] args) {
		BasicStack sourceRod = StackUtils.buildStack(), auxRod = new BasicStack(), targetRod = new BasicStack();
		
		printRods(sourceRod, auxRod, targetRod);
		
		solveTOH(6, sourceRod, auxRod, targetRod);
		
		printRods(sourceRod, auxRod, targetRod);
	}
	
	private static void solveTOH(int size, BasicStack sourceRod, BasicStack auxRod, BasicStack targetRod) {
		if (size == 1) {
			targetRod.push(sourceRod.pop());
		} else {
			// move n-1 from source to aux rod
			solveTOH(size - 1, sourceRod, targetRod, auxRod);
			// move nth item from source to target
			targetRod.push(sourceRod.pop());
			// move n-1 from aux to target rod
			solveTOH(size - 1, auxRod, sourceRod, targetRod);
		}
	}
	
	private static void printRods(BasicStack sourceRod, BasicStack auxRod, BasicStack targetRod) {
		System.out.println("==================");
		System.out.println("Source:" + sourceRod.printStack());
		System.out.println("Aux:" + auxRod.printStack());
		System.out.println("Target:" + targetRod.printStack());
	}
}
