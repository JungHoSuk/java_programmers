package level0;

public class Factorial {

	public static void main(String[] args) {
		int n= 7;
		int answer = 1;
		int result = 1;
		int count = 0;
		while(result <= n) {
			count++;
			result *= count;
			answer = count-1;
		}
		System.out.println(answer);
	}

}
