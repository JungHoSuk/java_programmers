package level0;

import java.util.Arrays;

public class ControlZ {

	public static void main(String[] args) {
		int answer = 0;
		String s = "10 20 30 40";
		String[] s1 = s.split(" ");
		System.out.println(Arrays.toString(s1));
		for(int i=0;i<s1.length;i++) {
			if(s1[i].equals("Z")) {
				answer -= Integer.valueOf(s1[i-1]);
			}else {
				answer += Integer.valueOf(s1[i]);
			}
		}
		System.out.println(answer);
	}

}
