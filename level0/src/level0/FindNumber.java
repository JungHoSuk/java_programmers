package level0;

public class FindNumber {

	public static void main(String[] args) {
		int num = 12344;
		int k = 4;
		String strNum = String.valueOf(num);
		int answer = -1;
		
		for(int i=0;i<strNum.length();i++) {
			if(strNum.charAt(i)-48 == k) { answer = i+1; break;} 
		}
		
		System.out.println(strNum.charAt(3)-48);
		System.out.println(answer);
	}

}
