package level0;

public class AntColony {

	public static void main(String[] args) {
		int hp = 31;
		int answer = 0;
		answer += hp/5;
		hp%=5;
		answer += hp/3;
		hp%=3;
		answer += hp;
		
		System.out.println(answer);
		
	}

}
