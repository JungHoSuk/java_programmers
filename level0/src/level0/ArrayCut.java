package level0;

import java.util.Arrays;

public class ArrayCut {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		int num1 = 1;
		int num2 = 3;
		int num3 = 0;
		int[] answer = new int[num2-num1+1];
		
		for(int i=num1;i<=num2;i++) {
			answer[num3] = numbers[i];
			num3++;
		}
		System.out.println(Arrays.toString(answer));
	}

}
