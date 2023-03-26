package level0;

public class AddDigits {

	public static void main(String[] args) {
		int n = 1234;
		int answer = 0;
		while(n>=10) {
			answer += n%10; 
			n/=10;
		}
		answer += n;
		System.out.println(answer);
	}

}
