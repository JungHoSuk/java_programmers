package level0;

import java.util.Arrays;

public class ArrayDouble {

	public static void main(String[] args) {
		int[] numbers = {1,3,4,5,6};
		int[] answer = new int[numbers.length];
        for(int i=0; i<numbers.length;i++){
            answer[i] = numbers[i]*2;
        }
        System.out.println(Arrays.toString(answer));
		
	}

}
