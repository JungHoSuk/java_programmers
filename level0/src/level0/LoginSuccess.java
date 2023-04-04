package level0;

import java.util.HashMap;

public class LoginSuccess {

	public static void main(String[] args) {
		String[] id_pw = {"meosseugi","1234"};
		String[][] db = {{"rardss", "123"},{"yyoom", "1234"},{"meosseugi", "1234"}};
		String answer = "fail";
		String id = id_pw[0];
		String pw = id_pw[1];
		
		for(int i=0;i<db.length;i++) {
			if(id.equals(db[i][0])) {
				for(int j=0;j<2;j++) {
					if(pw.equals(db[i][j])) {
						answer = "login";
					}else {
						answer = "wrong pw";
					}
				}
			}
			
		}
	}

}
