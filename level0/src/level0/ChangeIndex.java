	package level0;

import java.util.Iterator;

public class ChangeIndex {

	public static void main(String[] args) {
		String my_string = "hello";
		int num1 = 1; 
		int num2 = 2;
		String answer = "";
		
		char charNum1 = my_string.charAt(num1);
		char charNum2 = my_string.charAt(num2);
		
		for(int i=0;i<my_string.length();i++) {
			if(i==num1) {
				answer += charNum2;
			}else if(i==num2) {
				answer += charNum1;
			}
			else {
				answer += my_string.charAt(i);
			}
		}
		
		System.out.println(answer);
		
	}

}
