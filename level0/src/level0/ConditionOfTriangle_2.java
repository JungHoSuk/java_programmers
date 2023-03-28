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
		
//		LongLine이 제일 긴 변일 경우
		answer = shortLine;
		
//		나머지 한 변이 제일 긴 변인 경우
		
		for(int i=0;i<LongLine+shortLine;i++) {
			if(i<LongLine+shortLine && i>LongLine) {cnt++;}
		}
		answer += cnt;
		System.out.println(answer);
		
		
	}

}
