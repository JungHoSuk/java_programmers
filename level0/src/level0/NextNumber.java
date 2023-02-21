package level0;

public class NextNumber {

	public static void main(String[] args) {
		int[] common = {-16 , -8 , -4 , -2};
		int answer = 0;
		int firstIncrease = common[1] - common[0];
		int secondIncrease = common[2] - common[1];
		System.out.println(firstIncrease);
		System.out.println(secondIncrease);
		if(secondIncrease == firstIncrease) {
			System.out.println("등차");
			answer = common[common.length-1] + firstIncrease;
		}else {
			System.out.println("등비");
			answer = common[common.length-1] * secondIncrease/firstIncrease;
		}
		
		
		System.out.println(answer);

	}

}
