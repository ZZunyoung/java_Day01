package Day09_Board;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class FileUtil {

	private static final String memberpath = "C:/Users/jyp86/git/java_Day01/jyp/src/Day09_Board/member.txt";
	
	public static int Membersave() { // ����Ʈ -> ��ü�ϳ��� -> �ʵ庰 �з� -> ȸ���ϳ��� ��������
		
		
		try {
		FileOutputStream fileOutputStream = new FileOutputStream(memberpath);
		
		for (Member member : List.members) {
			String outstring = member.getId() + "," + member.getPassword() + "," + member.getName() + "," + member.getEmail()+","+ member.getPoint() +"\n";
			fileOutputStream.write(outstring.getBytes());
		}
		return 1;
		}
		catch(Exception e){
			System.out.println("[����]");
		}	
		return -1;// ����
	}
	
	
	public static int memberload() {
		try {
			FileInputStream fileInputStream = new FileInputStream(memberpath);
			// 1. �Է½�Ʈ������ ����Ʈ�� �о����
			byte[] bytes = new byte[10000];
			fileInputStream.read(bytes);
			// 2. ���ڿ� ��ȯ
			String instring = new String(bytes);
			System.out.println(instring);
			// 3. ȸ�� �и��ϱ�
			String[] temp = instring.split("\n");
			// 4. ȸ���̳� ���� �и�
			for(int i=0; i <temp.length; i++) {
				String [] temp2 = temp[i].split(",");
				Member member = new Member(temp2[0], temp2[1], temp2[2], temp2[3], Integer.parseInt(temp2[4]));
				List.members.add(member);
			}
			// 5. ����Ʈ�� �ٽ� ���
			
		
			return 1;
		} catch (Exception e) {
			System.out.println("����ó�� ����");
			return -1;
		}
	}
	
}
