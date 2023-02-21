package level0;

import java.util.Arrays;

public class FindMode {

	public static void main(String[] args) {
		int[] array = {10,10,20,20};
		int[] arrayTest = new int[1000];
		int max = -1;
		int eq = 0;
		int answer = 0;
		for(int i=0;i<array.length;i++) {
			arrayTest[array[i]]++;
		}
		System.out.println(Arrays.toString(arrayTest));
		for(int i=0;i<arrayTest.length;i++) {
			if(arrayTest[i] > eq) {
				max = i;
				eq = arrayTest[i];
			}else if(arrayTest[i] == eq){
				max = -1;
			}
			
		}
		
		System.out.println(max);
		System.out.println(eq);
		if(array.length == 1) {
			answer = array[0];
		}else {
			answer = max;
		}
		
		
		System.out.println(answer);
	}

}
