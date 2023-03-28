package level0;

public class HiddenNumberAdd_2 {

	public static void main(String[] args) {
		String my_string = "abcdef";
		int answer = 0;
		String test = "";
		for(int i=0;i<my_string.length();i++){
			if(47<my_string.charAt(i)&&my_string.charAt(i)<58){
                test += my_string.charAt(i)-48;

            }else {
            	if(!test.isEmpty()) {
            		answer += Integer.valueOf(test);
            	}
                test = "";
            }
        }
		if(!test.isEmpty()) {answer += Integer.valueOf(test);}
		System.out.println(test);
		System.out.println(answer);
	}

}
