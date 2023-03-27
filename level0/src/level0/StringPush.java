package level0;


public class StringPush {

	public static void main(String[] args) {
		String A = "hello";
		String B = "lohel";
		String test = A;
		int answer = 0;
		String strA = "";
		int cnt = 0;
		for(int i=0;i<A.length();i++) {
			
			strA ="";
			for(int j=0;j<A.length();j++) {
				if(j==A.length()-1) {
					strA = A.charAt(A.length()-1) + strA;
				}else {
					strA += A.charAt(j);
				}
			}
			System.out.println(strA);
			if(B.equals(strA)) { cnt++; answer = i+1;  break;}
			if(i==A.length()-1) {answer = cnt==0 ? -1 : answer;}
			A = strA;
		}
		if(test.equals(B)) {answer = 0;}
		System.out.println(answer);
	}

}
