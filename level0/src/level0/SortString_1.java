package level0;

import java.util.ArrayList;
import java.util.Arrays;

public class SortString_1 {

	public static void main(String[] args) {
		String my_string = "adfadf1253";
		int[] answer;
		int cnt = 0;
		String test = "";
		ArrayList<Integer> arrAnswer = new ArrayList<Integer>();
		for(int i=0;i<my_string.length();i++) {
			if( my_string.charAt(i) > 47 && my_string.charAt(i) < 58) {
				cnt++;
				System.out.println(my_string.charAt(i));
				arrAnswer.add(Integer.valueOf(my_string.charAt(i))-48);
			}
		}
		System.out.println(arrAnswer.toString());
		
		answer = new int[cnt];
		arrAnswer.sort(null);
		System.out.println(arrAnswer.toString());
		for(int i=0;i<arrAnswer.size();i++) {
			answer[i] = arrAnswer.get(i);
		}
		System.out.println(Arrays.toString(answer));
	}

}
