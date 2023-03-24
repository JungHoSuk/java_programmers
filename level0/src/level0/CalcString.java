package level0;

import java.util.Arrays;

public class CalcString {

	public static void main(String[] args) {
		String my_string = "3 - 4";
		int answer = 0;
		String[] arr_my_string = new String[my_string.length()-2];
		String calc = "";
		
		arr_my_string = my_string.split(" ");
		System.out.println(Arrays.toString(arr_my_string));
		
		for(int i=0;i<arr_my_string.length;i++) {
			if(i==0) {answer = Integer.valueOf(arr_my_string[i]);}
			if(i%2!=0) {calc = arr_my_string[i];}
			else {
					if(calc.equals("+")) {
							answer += Integer.valueOf(arr_my_string[i]);
				}else if(calc.equals("-")){
							answer -= Integer.valueOf(arr_my_string[i]);
				}
			}
			
		}
		
		
		System.out.println(answer);
	}

}
