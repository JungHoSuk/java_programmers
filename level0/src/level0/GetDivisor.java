package level0;

import java.util.Arrays;

public class GetDivisor {

	public static void main(String[] args) {
		int n= 20;
		String strAnswer = "";
		int[] answer = null;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {strAnswer+= (char)i;}
		}
		
		answer = new int[strAnswer.length()];
		for(int i=0;i<strAnswer.length();i++) {
			answer[i] = strAnswer.charAt(i);
	
		}
		System.out.println(Arrays.toString(answer));
	}
}
