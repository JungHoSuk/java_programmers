package level0;

public class PizzaDivide2 {

	public static void main(String[] args) {
		int n = 10;
		int answer = 1;
		while(answer*6%n!=0) {
			answer++;
		}
		System.out.println(answer);
	}

}
