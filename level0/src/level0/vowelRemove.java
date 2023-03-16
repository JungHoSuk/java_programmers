package level0;

public class vowelRemove {

	public static void main(String[] args) {
		String my_string = "abcdefghijk";
		String answer = "";
		
		for(int i=0;i<my_string.length();i++) {
			if(my_string.charAt(i)=='a' || my_string.charAt(i)=='e' || my_string.charAt(i)=='i'|| my_string.charAt(i)=='o'|| my_string.charAt(i)=='u') {
				continue;
			}else {
				answer += my_string.charAt(i);
			}
			
		}
		System.out.println(answer);
		
	}

}
