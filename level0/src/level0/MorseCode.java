package level0;

import java.util.Arrays;

public class MorseCode {

	public static void main(String[] args) {
		String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		String letter = ".... . .-.. .-.. ---";
		String[] splitLetter = letter.split(" ");
		String answer = "";
		char charSplitLetter = 97;
		
		System.out.println(Arrays.toString(splitLetter));
		
		for(int i=0;i<splitLetter.length;i++) {
			for(int j=0;j<morse.length;j++) {
				if(splitLetter[i].equals(morse[j])) {
					charSplitLetter += j;
					 answer+= (Character)charSplitLetter;
					 charSplitLetter = 97;
				}
			}
		}
		System.out.println(answer);
		
	}

}
