package level0;

public class Game_369 {

	public static void main(String[] args) {
		int order = 34139;
		int answer = 0;
		String strOrder = String.valueOf(order);
		
		for(int i=0;i<strOrder.length();i++) {
			if(strOrder.charAt(i)-48==3 || strOrder.charAt(i)-48==6 || strOrder.charAt(i)-48==9) {
				answer++;
			}
		}
		System.out.println(answer);
	}

}
