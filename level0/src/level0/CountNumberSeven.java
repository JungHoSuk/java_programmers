package level0;


public class CountNumberSeven {

	public static void main(String[] args) {
		int[] array = {7,77,17};
		int answer = 0;
		String strArray = "";
        for(int i=0;i<array.length;i++){
        	strArray += array[i];
        }
        System.out.println(strArray);
        for(int i=0;i<strArray.length();i++) {
        	if(strArray.charAt(i)=='7') {
        		answer++;
        	}
        }
        System.out.println(answer);
	}

}
