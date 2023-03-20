package level0;

public class HiddenNumberAdd {

	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp";
		int answer = 0;
		for(int i=0;i<my_string.length();i++) {
			if(my_string.charAt(i) > 47 && my_string.charAt(i) < 58) {
				answer += (my_string.charAt(i)-48);
			}
		}
		System.out.println(answer);

	}

}
