package level0;

import java.util.Arrays;

public class CloseNumber {

	public static void main(String[] args) {
		int[] array = {11,11,15,18};
		int[] testArray = new int[array.length];
		int n = 14;
		int answer = 0;
		int test = 0;
		int index = 0;
		
		for(int i=0;i<array.length;i++) {
			if(n-array[i]<0) {
				testArray[i] = -(n-array[i]);
			}else {
				testArray[i] = n-array[i];
			}
		}
		System.out.println(Arrays.toString(testArray));
		for(int i=0;i<testArray.length;i++) {
			if(i==0) {
				test = testArray[i];
			}else {
				if(test>testArray[i]) {
					test = testArray[i];
					index = i;
				}else if(test==testArray[i]){
					index = array[i] > array[index] ? index : i;
				}	
			}
			System.out.println(test);
		}
		answer = array[index];
		System.out.println(answer);
	}

}
