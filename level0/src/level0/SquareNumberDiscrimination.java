package level0;

public class SquareNumberDiscrimination {

	public static void main(String[] args) {
		int n = 976;
		int answer = 2;
	
		for(int i=1;i<=1000;i++) {
			if((double)n/i==i) { 
				System.out.println(i);
				answer = 1; break;}
		}
		System.out.println(answer);
	}

}
