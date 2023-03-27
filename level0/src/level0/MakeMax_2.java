package level0;

public class MakeMax_2 {

	public static void main(String[] args) {
		int[] numbers = {1, -2};
		int answer = 0;
		int max = numbers[0] * numbers[1];
		int test = 0;
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers.length;j++) {
				if(i==j) {continue;}
				else {
					test = numbers[i] * numbers[j];
					max = max>test? max :test;
				}
			}
		}
		answer = max;
		System.out.println(answer);
	}

}
