package level0;

public class NumberOfOrderedPairs {

	public static void main(String[] args) {
		int n = 1201;
		int answer = 0;
		
		for(int i=1;i<=n;i++) {
			if(n%i==0){
				answer++;
			}
		}
		System.out.println(answer);
	}

}
