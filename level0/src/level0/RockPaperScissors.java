package level0;

public class RockPaperScissors {

	public static void main(String[] args) {
		String rsp = "2052";
		String[] arrRsp = rsp.split("");
		String answer = "";
		
		System.out.println(arrRsp.length);
		for(int i=0;i<arrRsp.length;i++) {
			if(arrRsp[i].equals("2")) {
				answer += 0;
			}else if(arrRsp[i].equals("5")) {
				answer += 2;
			}else {
				answer += 5;
			}
		}
		System.out.println(answer);
	}

}
