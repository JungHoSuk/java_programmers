package level0;

public class PizzaDivide1 {

	public static void main(String[] args) {
		int n = 15;
		int answer = 0;
		if(n<7) {
			answer = 1;
		}else if(n%7==0) {
			answer = n/7;
		}else {
			answer = n/7+1;
		}
	}

}
