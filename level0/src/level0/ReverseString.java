package level0;

public class ReverseString {

	public static void main(String[] args) {
		String my_string = "hosuk";
		String answer = "";
		for(int i=my_string.length();i>0;i--) {
			answer += my_string.charAt(i-1);
		}
		System.out.println(answer);
		
	}

}
