package level0;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		int[] numbers = {1,2,3};
		String direction = "left";
		int[] result = new int[numbers.length];
		int num = 0;
		
		if(direction.equals("right")) {
			num =  numbers[numbers.length-1];
			for(int i=0;i<numbers.length;i++) {
				if(i+1==numbers.length) {
					result[0] = num;
				}else {
					result[i+1] = numbers[i];
				}
			}
		}else {
			num = numbers[0];
			for(int i=0;i<numbers.length;i++) {
				if(i==numbers.length-1) {
					result[numbers.length-1] = num;
				}else {
					result[i] = numbers[i+1];
				}
			}
		}
		System.out.println(Arrays.toString(result));
	}

}
