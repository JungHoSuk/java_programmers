package level0;

import java.util.Arrays;

public class NotEven {

	public static void main(String[] args) {
		int n = 10;
		int test;
		int incre = 1;
		test = n%2==0?n/2:n/2+1;
		int[] answer = new int[test];
		for(int i=0;i<test;i++) {
			answer[i] = incre;
			incre = incre + 2;
		}
		System.out.println(Arrays.toString(answer));
	}

}
