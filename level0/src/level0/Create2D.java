package level0;

import java.util.Arrays;

public class Create2D {

	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
		int n = 2;
		int[][] answer = new int[num_list.length/n][n];
		int cnt = 0;
		
		for(int i=0;i<num_list.length/n;i++) {
			for(int j=0;j<n;j++) {
				answer[i][j] = num_list[cnt];
				cnt ++;
			}
		}
	}

}
