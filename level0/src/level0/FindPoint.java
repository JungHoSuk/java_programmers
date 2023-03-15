package level0;

public class FindPoint {

	public static void main(String[] args) {
		int[] dot = {3,-4};
		
		int answer = 0;
		
		if(dot[0] > 0 && dot[1] > 0) {
			answer = 1;
		}else if(dot[0] < 0 && dot[1] > 0) {
			answer = 2;
		}else if(dot[0] < 0 && dot[1] < 0) {
			answer = 3;
		}else {
			answer = 4;
		}
		System.out.println(answer);
	}

}
