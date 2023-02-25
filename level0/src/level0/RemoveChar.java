package level0;

public class RemoveChar {

	public static void main(String[] args) {
		String my_string = "abcdef"; 
		String letter = "e";
		String answer = "";
		answer = my_string.replace(letter, "");
		System.out.println(answer);
	}

}
