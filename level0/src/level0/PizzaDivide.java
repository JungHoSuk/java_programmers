package level0;

public class PizzaDivide {

	public static void main(String[] args) {
		int slice = 2;
		int n = 6;
		int answer = 0;
		
		if(slice >= n) {
			answer = 1;
		}else if(n%slice == 0) {
			answer = n/slice;
		}else {
			answer = n/slice + 1;
		}
		
	}

}
