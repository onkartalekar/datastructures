package practice_problems;

/**
 * @author taleko01
 */

public class RotateImage {
	
	public static void main(String[] args){
		//0,0->0,4; 0,1->1,4; 0,2->2,4; 0,3->3,4; 0,4->4,4
		//1,0->0,3; 1,1->1,3; 1,2->2,3; 1,3->3,3; 1,4->4,3
		//2,0->0,2; 2,1->1,2; 2,2->2,2; 2,3->3,2; 2,4->4,2
		//3,0->0,1; 3,1->1,1; 3,2->2,1; 3,3->3,1; 3,4->4,1
		//4,0->0,0; 4,1->1,0; 4,2->2,0; 4,3->3,0; 4,4->4,0
		
		// [i,j] -> [j, i-n]
		
		// for i -> o:n/2
		// for j -> i:n-i-1
		
		//top = 0,0
		// 0,0=4,0
		// 4,0=4,4
	}
}
