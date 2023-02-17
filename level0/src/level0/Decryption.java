package level0;

public class Decryption {

	public static void main(String[] args) {
		String cipher = "pfqallllabwaoclk";
		int code = 2;
		int realCode = code;
		int test = cipher.length()/code;
		String result ="";
		code -= 1;
		
		for(int i=0;i<test;i++) {
			
			System.out.println(cipher.charAt(code));
			result += cipher.charAt(code);
			code+= realCode;
		}
		System.out.println(result);
		
	}

}
