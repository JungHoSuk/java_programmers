package level0;

public class DuplicateNumberCount {

	public static void main(String[] args) {
		int[] array  = {1, 1, 2, 3, 4, 5};
		int n = 1;
		int answer = 0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i] == n) {answer++;}
		}
	}

}
