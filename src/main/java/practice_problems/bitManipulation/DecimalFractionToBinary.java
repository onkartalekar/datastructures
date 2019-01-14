package practice_problems.bitManipulation;

/**
 * @author taleko01
 */

public class DecimalFractionToBinary {
	
	public static void main(String[] args) {
		String input = "100.125";
		StringBuffer binary = new StringBuffer();
		StringBuffer binaryFraction = new StringBuffer();
		int pointIndex = input.indexOf('.');
		int integer = Integer.valueOf(input.substring(0, pointIndex));
		Float aFloat = Float.valueOf(input.substring(pointIndex));
		
		// convert integer part to binary
		for (; integer != 0; integer /= 2) {
			binary.append(integer % 2);
		}
		
		binary = binary.reverse();
		
		// convert fraction part to binary
		while (aFloat != 0.0) {
			aFloat *= 2;
			binaryFraction.append(aFloat.intValue());
			aFloat-=aFloat.intValue();
		}
		
		
		System.out.println(binary.append(".").append(binaryFraction).toString());
	}
}
