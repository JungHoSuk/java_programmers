package level0;

public class TossTheBall {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4};
		int k = 2;
		int answer = 0;
		int cnt = 0;
		
		for(int i=0;i<k;i++) {
			answer = numbers[cnt];
			System.out.println(answer);
			cnt += 2;
			System.out.println(cnt);
			if(cnt >= numbers.length) {
				cnt -= numbers.length;
			}
			
		}
		System.out.println(answer);
	}

}
