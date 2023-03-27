package level0;

import java.util.Arrays;

public class CutAndSaveArray {

	public static void main(String[] args) {
		String my_str = "abc1Addfggg4556b";
		int n = 6;
		int j = 0;
		int test = my_str.length()%n==0 ? my_str.length()/n : my_str.length()/n+1; 
		String[] answer = new String[test];
		
		for(int i=0;i<answer.length;i++) {
			answer[i] = "";
		}
		
		for(int i=0;i<my_str.length();i++) {
			System.out.println(i);
			j = i/n;
			answer[j] += my_str.charAt(i);
		}
		System.out.println(Arrays.toString(answer));
	}

}
