package level0;

import java.util.ArrayList;
import java.util.Arrays;

public class Factorization {

	public static void main(String[] args) {
		int n = 10000;
		int[] answer = null;
		ArrayList<Integer> arrAnswer = new ArrayList<Integer>();
		
		for(int i=2;i<n;i++) {
			while(n%i==0) {
				n/=i;
				arrAnswer.add(i);
			}
		}
		if(n!=1) {
			arrAnswer.add(n);
		}
		int[] arrAnswer2 = new int[arrAnswer.size()];
		for(int i=0;i<arrAnswer.size();i++) {
			arrAnswer2[i] = arrAnswer.get(i);
		}
		
		answer = Arrays.stream(arrAnswer2).distinct().sorted().toArray();
		
		System.out.println(Arrays.toString(answer));
	}

}
