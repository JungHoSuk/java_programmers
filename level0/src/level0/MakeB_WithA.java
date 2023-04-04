package level0;

public class MakeB_WithA {

	public static void main(String[] args) {
		String before = "olleh";
		String after = "helod";
		int answer = 0;
		
		for(int i=0;i<after.length();i++) {
			for(int j=0;j<before.length();j++) {
				if(before.charAt(i) == after.charAt(j)) {
					before = before.replaceFirst(String.valueOf(before.charAt(i)),"1");
					after = after.replaceFirst(String.valueOf(after.charAt(j)), "1");
					break;
				}
			}
		}
		
		System.out.println(before);
		System.out.println(after);
		answer = before.equals(after) ? 1 : 0;
	}

}
