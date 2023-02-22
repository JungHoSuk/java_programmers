package level0;

public class ArrayAvg {

	public static void main(String[] args) {
		int[] numbers = {1,3,4,5,6,7};
		double totalNum = 0;
		double answer = 0;
		
		for(int i =0;i<numbers.length;i++) {
			totalNum += numbers[i];
		}
		answer = totalNum/numbers.length;
		System.out.println(answer);
	}

}
