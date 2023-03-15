package level0;

public class NumberOfDice {

	public static void main(String[] args) {
		int[] box = {1,1,1};
		int n = 1;
		int answer = 1;
		
		answer *= box[0]/n;
		answer *= box[1]/n;
		answer *= box[2]/n;
		
		System.out.println(answer);
	}

}
