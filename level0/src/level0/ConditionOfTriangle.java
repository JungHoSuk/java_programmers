package level0;

public class ConditionOfTriangle {

	public static void main(String[] args) {
		int[] sides = {3,6,2};
		int answer = 0;
		int max = 0;
		int maxIndex = 0;
		
		for(int i=0;i<sides.length;i++) {
			if(max < sides[i]) {
				max = sides[i];
				maxIndex = i;
			}
		}
		if(maxIndex == 0) {
			answer = sides[maxIndex] < sides[1] + sides[2] ? 1 : 2;
		}else if(maxIndex==1){
			answer = sides[maxIndex] < sides[0] + sides[2] ? 1 : 2;
		}else {
			answer = sides[maxIndex] < sides[0] + sides[1] ? 1 : 2;
		}
		
		
		System.out.println(answer);
	}
	

}
