package level0;

public class UppercaseAndLowercase {

	public static void main(String[] args) {
		String my_string = "ccCC";
		String answer = "";
		for(int i=0;i<my_string.length();i++) {
			
			answer += my_string.charAt(i) > 64 && my_string.charAt(i)<91? (char)(my_string.charAt(i)+32):(char)(my_string.charAt(i)-32);
		}
		System.out.println(answer);
		
	}

}
