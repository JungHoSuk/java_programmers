package level0;

public class FiniteDecimal {

	public static void main(String[] args) {
		int a = 13;
		int b = 22;
		int test = 0;
		
		for(int i=1;i<b;i++) {
			if(a%i == 0 && b%i ==0) {
				test = i;
			}
		}
		a = a/test;
		b = b/test;
		
		while(b%2==0) {
			b = b/2;
		}
		while(b%5==0) {
			b = b/5;
		}
		if(b==1) {
			System.out.println(1);
		}else {
			System.out.println(2);
		}
		
	}

}
