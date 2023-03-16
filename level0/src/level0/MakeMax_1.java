package level0;

import java.util.Arrays;
import java.util.Iterator;

public class MakeMax_1 {

	public static void main(String[] args) {
		int[] numbers = {1,1,2,2,3,3};
		int firstMax = 0;
		int secondMax = 0;
		int answer = 1;
		int index = 0;
		
		for(int i=0;i<numbers.length;i++) {
			if(firstMax<numbers[i]) {
				firstMax = numbers[i];
				index = i;
			}
		}
		for(int i=0;i<numbers.length;i++) {
			if(i!=index) {
				secondMax = secondMax>numbers[i]?secondMax:numbers[i];
			}
		}
		answer = firstMax*secondMax;
		System.out.println(answer);
		
	}

}
