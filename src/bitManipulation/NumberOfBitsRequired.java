package bitManipulation;

/**
 * @author taleko01
 */

public class NumberOfBitsRequired {
	
	public static void main(String[] args) {
		int source = 31, target = 14, numberOfBitsRequired = 0;
		System.out.println(BitUtils.decimalToBinary(source));
		System.out.println(BitUtils.decimalToBinary(target));
		int result = source ^ target;
		String temp = BitUtils.decimalToBinary(result);
		System.out.println(temp);
		
		for (; result != 0; result = result >> 1) {
			int num = result & 1;
			numberOfBitsRequired += num;
		}
		
		/*while (temp.contains("1")) {
			numberOfBitsRequired++;
			temp = temp.substring(temp.indexOf("1") + 1, temp.length());
		}*/
		
		if (numberOfBitsRequired == 1) {
			System.out.println("Number of bit required to convert " + source + " to " + target + " is " + numberOfBitsRequired);
		} else {
			System.out.println("Number of bits required to convert " + source + " to " + target + " are " + numberOfBitsRequired);
		}
	}
	
}
