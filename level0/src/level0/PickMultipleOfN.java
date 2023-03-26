package level0;

import java.util.ArrayList;
import java.util.Arrays;


public class PickMultipleOfN {

	public static void main(String[] args) {
		int[] numlist = {1, 9, 3, 10, 13, 5};
		int n = 5;
		ArrayList<Integer> arrNumList = new ArrayList<Integer>();
		int[] answer = null;
		for(int i=0;i<numlist.length;i++) {
			if(numlist[i]%n==0) {
				arrNumList.add(numlist[i]);
			}
		}
		answer = arrNumList.stream().mapToInt(i -> i).toArray();
		System.out.println(Arrays.toString(answer));
	}

}
