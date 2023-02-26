package level0;

import java.util.Arrays;

public class OrderOfTreatment {

	public static void main(String[] args) {
		int[] emergency = {1, 6, 4,9};
		int[] answer = new int[emergency.length];
		int[] test = new int[emergency.length];
		int num;
		
		for(int i=0;i<emergency.length;i++) {
			test[i] = emergency[i];
		}
		
		for(int i=0;i<emergency.length;i++) {
			for(int j=i+1;j<emergency.length;j++) {
				if(test[i] < test[j]) {
					num = test[i];
					test[i] = test[j];
					test[j] = num;
					System.out.println(Arrays.toString(test));
				}
			}
		}
		System.out.println("첫번째 for문 결과: " + Arrays.toString(test));
		System.out.println("원래 배열: " + Arrays.toString(emergency));
//		test[] = 90 20 3
		for(int i=0;i<emergency.length;i++) {
			for(int j=0;j<emergency.length;j++) {
				if(test[i] == emergency[j]) {
					answer[j] = i+1;
				}
			}
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
