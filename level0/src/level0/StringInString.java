package level0;

public class StringInString {

	public static void main(String[] args) {
		String str1 = "ab6CDE443fgh22iJKlmn1o";
		String str2 = "6CDd";
		int answer = 2;
		
		if(str1.contains(str2)) {answer = 1;}
		System.out.println(answer);
	}

}
