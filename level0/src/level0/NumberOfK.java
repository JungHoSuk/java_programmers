package level0;

public class NumberOfK {

	public static void main(String[] args) {
		int i = 1;
		int j = 13;
		int k = 1;
		int answer = 0;
		String strAnswer = "";
		
		for(i=i;i<=j;i++) {
			
			strAnswer = String.valueOf(i);
			for(int a=0;a<strAnswer.length();a++) {
				if(strAnswer.charAt(a) == (char)(k+48)) {
					System.out.println(i);
					answer++;
				}
			}
			
		}
		System.out.println(answer);
	}

}
