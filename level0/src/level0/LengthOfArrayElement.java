package level0;

public class LengthOfArrayElement {

	public static void main(String[] args) {
		String[] strlist = {"We", "are", "the", "world!"};
		int[] answer = new int[strlist.length];
		System.out.println(strlist[0].length());
		System.out.println(strlist[1].length());
		System.out.println(strlist[2].length());
		System.out.println(strlist[3].length());
		for(int i=0;i<strlist.length;i++) {
			answer[i] = strlist[i].length();
		}
		
	}

}
