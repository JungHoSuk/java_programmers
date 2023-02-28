package level0;

import java.math.BigInteger;

public class SplitMarble {

	public static void main(String[] args) {
		int balls = 3;
		int share = 2;

		int answer = 0;
		
//		bigInteger형 answer
		BigInteger bigAnswer = new BigInteger("1");
//		분모
		BigInteger denominator = new BigInteger("1");
//		분자
		BigInteger molecule = new BigInteger("1");
		
		for(int i=balls;0<i;i--) {
			BigInteger bigI = BigInteger.valueOf(i);
			molecule = molecule.multiply(bigI);
		}
		System.out.println(molecule);
		for(int i=(balls-share);0<i;i--) {
			BigInteger bigI = BigInteger.valueOf(i);
			denominator = denominator.multiply(bigI);
		}
		System.out.println(denominator);
		for(int i=share;0<i;i--) {
			BigInteger bigI = BigInteger.valueOf(i);
			denominator = denominator.multiply(bigI);
		}
		System.out.println(denominator);
		System.out.println(molecule);
		bigAnswer = molecule.divide(denominator);
		answer = bigAnswer.intValue();

		System.out.println(answer);
	}

}
