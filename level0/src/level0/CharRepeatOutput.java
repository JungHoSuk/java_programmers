package level0;

public class CharRepeatOutput {

	public static void main(String[] args) {
		String my_string = "abcde";
		int n = 4;
		String answer = "";
		for(int i=0;i<my_string.length();i++) {
			for(int j=0;j<n;j++) {
				answer += my_string.charAt(i);
			}
		}
		
		System.out.println(answer);
	}

}
