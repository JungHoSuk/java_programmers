package level0;

public abstract class BacterialGrowth {

	public static void main(String[] args) {
		int n= 2;
		int t = 10;
		int answer = n;
		for(int i=0;i<t;i++) {
			answer *= 2;
		}
		System.out.println(answer);
	}

}
