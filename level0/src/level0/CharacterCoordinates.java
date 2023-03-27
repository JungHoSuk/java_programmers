package level0;

import java.util.Arrays;

public class CharacterCoordinates {

	public static void main(String[] args) {
		String[] keyinput = {"down", "down", "down", "down", "down"};
		int[] board = {7,9};
		int[] answer = {0,0};
		
		int x = board[0]/2;
		int y = board[1]/2;
		for(int i=0;i<keyinput.length;i++) {
			switch (keyinput[i]) {
			case "left":
				if(answer[0] != -x) {answer[0]--;}
				break;
			case "right": 
				if(answer[0] != x) {answer[0]++;}
				break;
			case "up": 
				if(answer[1] != y) {answer[1]++;}
				break;
			case "down": 
				if(answer[1] != -y) {answer[1]--;}
				break;
			
			}
		}
		System.out.println(Arrays.toString(answer));
	}
}
