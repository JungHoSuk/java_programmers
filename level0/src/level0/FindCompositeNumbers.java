package level0;

public class FindCompositeNumbers {

	public static void main(String[] args) {
		int n = 10;
		int answer = 0;
		for(int i=2;i<=n;i++) {
			System.out.println("i는: " + i);
			if(i<10) {
				if(i==2||i==3||i==5||i==7) {
					continue;	
				}else {
					System.out.println("i값이 " + i + " 일 때 증가");
					answer++;
				}
			}
			if(i>=10) {
				if(i%2==0 || i%3==0 || i%5==0 || i%7==0) {
					answer++;
				}
			}
		}
		System.out.println(answer);
		
	}

}
