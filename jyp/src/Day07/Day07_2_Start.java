package Day07;

import java.util.Scanner;
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
