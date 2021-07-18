package Day09_Board;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class FileUtil {

	private static final String memberpath = "C:/Users/jyp86/git/java_Day01/jyp/src/Day09_Board/member.txt";
	
	public static int Membersave() { // 리스트 -> 객체하나씩 -> 필드별 분류 -> 회원하나씩 내보내기
		
		
		try {
		FileOutputStream fileOutputStream = new FileOutputStream(memberpath);
		
		for (Member member : List.members) {
			String outstring = member.getId() + "," + member.getPassword() + "," + member.getName() + "," + member.getEmail()+","+ member.getPoint() +"\n";
			fileOutputStream.write(outstring.getBytes());
		}
		return 1;
		}
		catch(Exception e){
			System.out.println("[오류]");
		}	
		return -1;// 실패
	}
	
	
	public static int memberload() {
		try {
			FileInputStream fileInputStream = new FileInputStream(memberpath);
			// 1. 입력스트림에서 바이트로 읽어오기
			byte[] bytes = new byte[10000];
			fileInputStream.read(bytes);
			// 2. 문자열 변환
			String instring = new String(bytes);
			System.out.println(instring);
			// 3. 회원 분리하기
			String[] temp = instring.split("\n");
			// 4. 회원이나 변수 분리
			for(int i=0; i <temp.length; i++) {
				String [] temp2 = temp[i].split(",");
				Member member = new Member(temp2[0], temp2[1], temp2[2], temp2[3], Integer.parseInt(temp2[4]));
				List.members.add(member);
			}
			// 5. 리스트에 다시 담기
			
		
			return 1;
		} catch (Exception e) {
			System.out.println("파일처리 오류");
			return -1;
		}
	}
	
}
