package level0;

public class ClothingDiscount {

	public static void main(String[] args) {
		int price = 500000;
		
		if(price >= 500000) {
			price*=0.8;
		}else if(price >= 300000) {
			price*=0.9;
		}else if(price >= 100000) {
			price*=0.95;
		}else {
			System.out.println(price);;
		}
		
		System.out.println(price);
	}
	

}
