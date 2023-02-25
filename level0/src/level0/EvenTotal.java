package level0;

public class EvenTotal {

	public static void main(String[] args) {
		int n = 10;
		int answer = 0;
		n = n%2==0? n : n-1;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				answer += i;
			}
		}
			System.out.println(answer);
	}

}
