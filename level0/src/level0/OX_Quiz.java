package level0;

import java.util.Arrays;

public class OX_Quiz {

	public static void main(String[] args) {

		String[] quiz = {"3 - 4 = -3","5 + 6 = 11"};
		String[] splitQuiz = null;
		String[] answer = new String[quiz.length];
		for(int i=0;i<quiz.length;i++) {
			splitQuiz = quiz[i].split(" ");
			System.out.println(Arrays.toString(splitQuiz));
			if(splitQuiz[1].equals("+")) {
				answer[i] = Integer.valueOf(splitQuiz[0]) + Integer.valueOf(splitQuiz[2]) == Integer.valueOf(splitQuiz[4])?"O":"X";
			}else {
				answer[i] = Integer.valueOf(splitQuiz[0]) - Integer.valueOf(splitQuiz[2]) == Integer.valueOf(splitQuiz[4])?"O":"X";
			}
			
		}
		System.out.println(Arrays.toString(answer));
	}

}
