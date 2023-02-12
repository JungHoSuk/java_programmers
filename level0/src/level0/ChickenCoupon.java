package level0;

public class ChickenCoupon {

	public static void main(String[] args) {
		
		int chicken = 1999;
		int answer = 0;
		int coupon = 0;
			
		while(chicken+coupon>=10) {
			answer = answer + chicken/10;
			coupon = coupon + chicken%10;
			if(coupon>=10) {
				answer++;
				coupon -= 10;
	               coupon++;
			}
			chicken = chicken/10;
		}
		System.out.println(answer);
		
	}

}
