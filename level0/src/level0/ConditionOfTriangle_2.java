package level0;

public class ConditionOfTriangle_2 {

	public static void main(String[] args) {
		int[] sides = {11,7};
		int answer = 0;
		int LongLine = 0;
		int shortLine = 0;
		int cnt = 0;
		
		if(sides[0] > sides[1]) {
			LongLine = sides[0];
			shortLine = sides[1];
		}else {
			LongLine = sides[1];
			shortLine = sides[0];
		}
		
//		LongLine�� ���� �� ���� ���
		answer = shortLine;
		
//		������ �� ���� ���� �� ���� ���
		
		for(int i=0;i<LongLine+shortLine;i++) {
			if(i<LongLine+shortLine && i>LongLine) {cnt++;}
		}
		answer += cnt;
		System.out.println(answer);
		
		
	}

}
