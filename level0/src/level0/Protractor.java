package level0;

public class Protractor {

	public static void main(String[] args) {
		int angle = 4;
		int answer = 0;
		
		if(0<angle && angle < 90) {
			answer = 1;
		}else if(angle == 90) {
			answer = 2;
		}else if(angle < 180) {
			answer = 3;
		}else {
			answer = 4;
		}
		
		System.out.println(answer);
	}

}
