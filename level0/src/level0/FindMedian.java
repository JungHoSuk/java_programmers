package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMedian {

	public static void main(String[] args) {
		int answer = 0;
		int[] array = {9,-1,0};
		List<Integer> arrayInt = new ArrayList<Integer>();
		for(int i=0;i<array.length;i++) {
			arrayInt.add(array[i]);
		}
		List<Integer> resultInt = new ArrayList<Integer>();
		arrayInt.sort(Comparator.naturalOrder());
		
		answer = arrayInt.get(arrayInt.size()/2);
		System.out.println(answer);
	}

}
