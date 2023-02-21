package level0;

import java.util.Arrays;

public class NextNumberPlus {

	public static void main(String[] args) {
		int num =3;
		int total = 12;
		int[] answer = new int[num];
		
		int startNum = 0;
		int middleNum = total/num;
		
		startNum = num%2==0? total - middleNum*(num-1) - (num-1) :total - middleNum*(num-1) - num/2 ;
		
		for(int i=0;i<num;i++) {
			answer[i] = startNum + i;
		}
		System.out.println(Arrays.toString(answer));
	}

}
