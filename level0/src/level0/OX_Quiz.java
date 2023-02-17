package level0;

import java.util.Arrays;

public class OX_Quiz {

	public static void main(String[] args) {

		String[] answer = {"3 - 4 = -3","5 + 6 = 11"};
		String[] answer2 = null;
		String x,y,z;
		for(int i=0;i<answer.length;i++) {
			answer2 = answer[i].split(" ");
			System.out.println(Arrays.toString(answer2));
		}
	}

}
