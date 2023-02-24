package level0;

import java.util.Arrays;

public class OddEvenCount {

	public static void main(String[] args) {
		int[] num_list = {1,2,3,4,5};
		int[] answer = new int[2];
		int oddNum = 0;
		int evenNum = 0;
		for(int i=0;i<num_list.length;i++) {
			if(num_list[i]%2==0) {
				evenNum++;
			}else {
				oddNum++;
			}
			
		}
		answer[0] = evenNum;
		answer[1] = oddNum;
	     System.out.println(Arrays.toString(answer));;
	}

}
