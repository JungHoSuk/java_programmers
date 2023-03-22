package level0;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		String my_string = "people";
		String answer = "";
		
		for(int i=0;i<my_string.length();i++) {
			for(int j=0;j<my_string.length();j++) {
				if(my_string.charAt(i) == my_string.charAt(j)){
					if(answer.contains(String.valueOf(my_string.charAt(i)))) {
						continue;
					}else {
						answer += my_string.charAt(i);
					}
				}
			}
		}
		System.out.println(answer);
	}

}
