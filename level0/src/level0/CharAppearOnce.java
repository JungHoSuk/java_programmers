package level0;

import java.util.Arrays;

public class CharAppearOnce {

	public static void main(String[] args) {
		String s = "abcabcadc";
		String answer = "";
		int[] cnt = new int[26];
		for(int i=0;i<s.length();i++) {
			cnt[s.charAt(i)-97]++;
		}	
		System.out.println(Arrays.toString(cnt));
		for(int i=0;i<cnt.length;i++) {
			if(cnt[i]==1) {
				answer += (char)(97+i);
			}
		}
		System.out.println(answer);
	}

}
