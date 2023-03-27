package level0;

public class TallerThanShyPerson {

	public static void main(String[] args) {
		int[] array = {149, 180, 192, 170};
		int height = 160;
		int answer = 0;
		for(int i=0;i<array.length;i++) {
			if(array[i] > height) {answer++;}
		}
	}

}
