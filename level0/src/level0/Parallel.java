package level0;

public class Parallel {

	public static void main(String[] args) {
		int[][] dots= {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
		int answer = 0;
		
//		answer = (dots[3][0] - dots[1][0] == dots[2][0] - dots[0][0] && dots[3][1] - dots[1][1] == dots[2][1] - dots[0][1])?1:0;
		
		
		int x1 = dots[0][0]; 
		int y1 = dots[0][1];
		int x2 = dots[1][0]; 
		int y2 = dots[1][1]; 
		int x3 = dots[2][0]; 
		int y3 = dots[2][1]; 
		int x4 = dots[3][0];
		int y4 = dots[3][1];
		
//		기울기 확인
		if((double)(y3-y1)/(x3-x1) == (double)(y4-y2)/(x4-x2)) {
//			두 직선이 겹치는지 확인
					answer =1;
		}else {
			if(((x1<x2&&x2<x3)||(x2<x3&&x3<x4))&&((y1<y2&&y2<y3)||(y2<y3&&y3<y4))) {
				answer = 1;
			}else {
				answer = 0;
			}
			
		}
		
		System.out.println(answer);
		
	}

}
