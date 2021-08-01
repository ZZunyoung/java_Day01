package Day13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Day13_1 {

	
	
	
	
	
	public static void main(String[] args) {
		
		// 1. LinkedList
		ArrayList<String> arrayList = new ArrayList<>();
		// arraylist Ŭ������ String Ŭ������ ���׸����� �����Ͽ� ����Ʈ ��ü ����
		LinkedList<String> linkedList = new LinkedList<>();
		
		Long start;
		Long end;
		
		start = System.nanoTime(); // ���� �ð�[����] �޼ҵ�
		for(int i = 0 ; i< 10000 ; i++) {
			arrayList.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("arraylist ������ add�ϴµ� �ɸ��� �ð� : " + (end - start));
		
		start = System.nanoTime(); // ���� �ð�[����] �޼ҵ�
		for(int i = 0 ; i< 10000 ; i++) {
			linkedList.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("linkedlist ������ add�ϴµ� �ɸ��� �ð� : " + (end - start));
		
		
		// ���� 1 : ����� ���α׷� [ Linkedlist Ŭ���� ��� ]
			// �޴� [���ѷ���]
				// ����� ���
				// 1. ��� �߰� [ �ο��� �Է¹޾� => ����ȣ [����Ʈ����] �ο�]
				// 2. ��� ���� [ ���� �� ����ȣ ���� ]
				// 3. ��� ��� [ ��� ��ȣ�� �Է¹޾� ��� ]
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			
			System.out.println("---- ��� ��� ----");
			System.out.println("��ȣ \t �ο���");
			for(int i = 0; i<list.size() ; i++) {
				System.out.println((i+1)+"\t"+list.get(i));
			}
			System.out.println("1.����߰� 2.������ 3.�������");
			System.out.print("���� : ");
			int ch = scanner.nextInt();
			if(ch == 1) {
				System.out.print("�ο��� : ");
				int count = scanner.nextInt();
				list.add(count);
				System.out.println("����ȣ : " + list.size());
			}
			if(ch == 2) {
				System.out.print("��ҹ�ȣ :");
				int count = scanner.nextInt();
				list.remove(count-1);
			}
			if(ch == 3 ) {
				System.out.println("��� ����");
				list.remove(0);
			}
		}
		
		
		
		
		
	}
	
	
}
