import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static int[] cutTheSticks(int[] arr) {
		// Complete this function
		int lengthOfCut = 0, resultIndex=0;
		int[] result = new int[arr.length];
		
		if(arr.length>0){
			for(;arr.length>0;arr=sticksLeft(arr)) {
				Arrays.sort(arr);
				lengthOfCut = arr[0];
				for (int index = 0; index < arr.length; index++) {
					arr[index] = arr[index] - lengthOfCut;
				}
				result[resultIndex++] = arr.length;
			}
		}
		return Arrays.copyOf(result, resultIndex);
	}
	
	static int[] sticksLeft(int[] arr) {
		int elementIndex=0;
		boolean shouldRemoveStick = arr.length==1;
		for (int index = 0; index < arr.length-1; index++) {
			if (arr[index] == 0) {
				shouldRemoveStick = true;
				elementIndex = index > elementIndex ? index : elementIndex;
			}
		}
		if(shouldRemoveStick) {
			arr = removeStick(arr, elementIndex);
		}
		return arr;
	}
	
	private static int[] removeStick(int[] arr, int elementIndex) {
		for(int index=0; index<arr.length-elementIndex-1; index++){
			arr[index] = arr[index+elementIndex+1];
		}
		return Arrays.copyOf(arr, arr.length-elementIndex-1);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		int[] result = cutTheSticks(arr);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");
		
		
		in.close();
	}
}
