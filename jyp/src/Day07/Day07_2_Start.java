package Day07;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Day07_2_Start {

	// 1. �ٸ� Ŭ�������� �������� �޸� => static
		// 1. scanner
	public static Scanner scan = new Scanner(System.in);
		// 2. ����Ʈ�� �迭
	public static ArrayList<Member> member = new ArrayList<>();
		// ArrayList : ����Ʈ Ŭ����
			//<���׸�> : ����Ʈ��ü�� ���� ��ü�� Ŭ����
				// ����Ʈ��.add(��ü��) : ����Ʈ�� ��ü ���
				// ����Ʈ��.size() : ����Ʈ�� ��ü ��
	
				// ����Ʈ��.get(�ε��� ��ȣ) : ����Ʈ�� �ε��� ��ȣ�� �ش��ϴ� ��ü ȣ��
	public static void main(String[] args) {
		
		���α׷�����();
	}
	
	// ���α׷� ���� �޼ҵ� 
	public static void ���α׷�����() {
		
		// ���Ͽ� �����ϴ� ��� ȸ���� ����Ʈ�� ����
		try {
			FileInputStream fileInputStream = new FileInputStream("c:/java/memberlist.txt");
			byte [] ����Ʈ = new byte [10000]; // ��ü �ϳ��� 100����Ʈ
			fileInputStream.read(����Ʈ);
			String ���ȸ�� = new String (����Ʈ); // ����Ʈ => ���ڿ�
			// ȸ���� ����
			String [] ȸ�� = ���ȸ��.split("\n");
					// ���ڿ�.split("��ȣ") : �ش� �������� �и�
			// ȸ�� ���� ȸ�������� ����
			for (int i = 0; i<ȸ��.length-1 ; i++) {
				
				String[]���� = ȸ��[i].split(",");
				Member member = new Member(����[0], ����[1], ����[2], Integer.parseInt(����[3]), ����[4], Integer.parseInt(����[5]), Integer.parseInt(����[6]), ����[7]);
					// ���ڿ� String => ������ int
						// Integer.parseInt(���ڿ�)
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// static : �������� : ���α׷� ���۽� �޸��Ҵ�ǰ� ��� ���α׷� ����� �޸� �ʱ�ȭ
			// ���� : �޸� ȿ�� ���� [ ��� Ŭ������ ���Ǵ� �޸� ���� ]
		
		while(true) {
			System.out.println("---- ȸ���� Ŀ�´�Ƽ ----");
			System.out.println("1. �α��� 2. ȸ������ 3. ���̵�ã�� 4. ��й�ȣã�� 5. ���α׷�����");
			System.out.print("---- ���� : "); int ���� = scan.nextInt();
			// ��� �ӽ� ��ü
			Member member = new Member();
			if ( ���� == 1 ) {
				
			}
			else if ( ���� == 2 ) {
				member.ȸ������();
			}
			else if ( ���� == 3 ) {
				
			}
			else if ( ���� == 4 ) {
	
			}
			else if ( ���� == 5 ) {
				System.out.println("[����] �̿����ּż� �����մϴ�.");
				break;
			}
			else {
				System.out.println("[���] �˼� ���� ��ȣ�Դϴ�.");
			}
		}
	}
}
