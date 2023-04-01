package level0;

public class CussedNumber3 {

	public static void main(String[] args) {
		int n = 40;
		int answer = 0;
		
		
		for(int i=1;i<=n;i++) {
			System.out.println(i + "ÀÏ¶§");
			answer++;
			while(answer%3==0 || String.valueOf(answer).contains("3")) {
				answer++;
			if(String.valueOf(answer).contains("3")) {
				answer++;
				}
			}
			System.out.println(answer);
		}
		System.out.println(answer);
	
	}
}
