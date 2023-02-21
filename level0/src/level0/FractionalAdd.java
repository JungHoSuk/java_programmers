package level0;

import java.util.Arrays;

public class FractionalAdd {

	public static void main(String[] args) {
		int numer1 = 5; 
		int denom1 = 4; 
		int numer2 = 1; 
		int denom2 = 4;
		int numer = 0;
		int denom = 0;
		int max = 1;
		int[] answer = new int[2];
		
		 if(denom1==denom2){
	            numer = numer1+numer2;
	            denom = denom1;
	        }else{
	            numer = numer1 * denom2 + numer2 * denom1;
			    denom = denom1 * denom2;
	        }
		System.out.println(numer);
		System.out.println(denom);
		
		for(int i=1; i<=numer && i<=denom; i++) {
			if(numer%i ==0 && denom%i ==0) {
				max = i;
			}
		}
		answer[0] = numer/max;
		answer[1] = denom/max;
		System.out.println(Arrays.toString(answer));
	}

}
