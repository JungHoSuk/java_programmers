package level0;

public class HateEnglish {

	public static void main(String[] args) {
		String numbers = "onetwothree";
		String test = "";
		String strAnswer = "";
		Long answer = 0L;
		
		for(int i=0;i<numbers.length();i++) {
			test += numbers.charAt(i);
			if(test.equals("zero")||test.equals("one")||test.equals("two")||test.equals("three")||test.equals("four")||test.equals("five")||test.equals("six")||test.equals("seven")||test.equals("eight")||test.equals("nine")) {
				switch(test) {
				case "zero" : strAnswer += 0; test = "";
					break;
				case "one" : strAnswer += 1; test = "";
				break;
				case "two" : strAnswer += 2; test = "";
				break;
				case "three" : strAnswer += 3; test = "";
				break;
				case "four" : strAnswer += 4; test = "";
				break;
				case "five" : strAnswer += 5; test = "";
				break;
				case "six" : strAnswer += 6; test = "";
				break;
				case "seven" : strAnswer += 7; test = "";
				break;
				case "eight" : strAnswer += 8; test = "";
				break;
				case "nine" : strAnswer += 9; test = "";
				break;
				}
			}
		}
		System.out.println(strAnswer);
		answer = Long.valueOf(strAnswer);
		System.out.println(answer);
	}

}
