package level0;

import java.util.Arrays;

public class PolynomialAdd {

	public static void main(String[] args) {
		String polynomial = "13x + 21 + x";
		String answer = "";
		int num = 0;
		int numX = 0;
		String strNumX = "";
		
		String[] arrPolynomial = polynomial.split(" ");
		
		System.out.println(Arrays.toString(arrPolynomial));
		
		for(int i=0;i<arrPolynomial.length;i++) {
			
			if(arrPolynomial[i].equals("+")) {
				continue;
			}else {
				if(arrPolynomial[i].contains("x")) {
					strNumX = arrPolynomial[i].replace("x" , "");
					System.out.println(i + "¹øÂ°");
					System.out.println(strNumX);
					if(strNumX.isEmpty()) {
						numX += 1;
					}else {
						System.out.println(strNumX);
						numX = numX + Integer.valueOf(strNumX);
					}
				}else {
					num += Integer.valueOf(arrPolynomial[i]);
				}
			}
		}
		if(num == 0 && numX ==0) {
			answer = "0";
		}
		else {
			if(num==0) {
				if(numX == 1) {
					answer = "x";
				}else {
					answer = numX + "x";
				}
			}else if(numX == 0) {
				answer += num;
			}
			else {
				if(numX == 1) {
					answer = "x " + "+ " + num;
				}else {
					answer = numX + "x " + "+ " + num;
				}
			}
		}
		
		
		System.out.println(answer);
	}

}
