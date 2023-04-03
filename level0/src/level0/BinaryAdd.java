package level0;

import java.util.Arrays;

public class BinaryAdd {

	public static void main(String[] args) {
		String bin1 = "1011111111";
		String bin2 = "11";
		String answer = "";
		String result = "";
		int[] test = null;
		int length = 0;
		int cnt = 0;
		
		length = Math.abs(bin1.length()-bin2.length());
		for(int i=length;i>0;i--) {
			if(bin1.length()>bin2.length()) {
				bin2 = "0" + bin2;
			}else {
				bin1 = "0" + bin1;
			}
			
		}
		
		for(int i=0;i<bin1.length();i++) {
			result += (Integer.valueOf(bin1.charAt(i)-48) + Integer.valueOf(bin2.charAt(i))-48);
		}
		test = new int[result.length()];
		for(int i=0;i<test.length;i++) {
			test[i] = result.charAt(i)-48;
		}
		for(int i=test.length-1;i>=0;i--) {
			test[i] += cnt;
			if(test[i] >= 2) {
				test[i] -= 2;
				cnt = 1;
			}else {
				cnt = 0;
			} 
		}
		for(int i=0;i<test.length;i++) {
			answer += test[i];
		}
		if(cnt == 1) {	answer = "1" + answer;}
		System.out.println(answer);
	}

}
