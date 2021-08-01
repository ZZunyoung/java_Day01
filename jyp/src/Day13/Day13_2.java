package Day13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Day13_2 {

	
	
	public static void main(String[] args) {
		
		// 2. set �÷��� : 1. HashSet 2. TreeSet
			// List : ������ �ִ� ���� [ �ߺ� ��� ]
			// Set : ������ ���� ���� [ �ߺ� �Ұ� ]
		
		// 1. HashSet Ŭ����
		HashSet<String> hashSet = new HashSet<>();
			// HashSet Ŭ������ String Ŭ������ ���׸����� �����Ͽ� ��ü ����
			// 2. �޼ҵ�
		hashSet.add("java");
		hashSet.add("python");
		hashSet.add("database");
		hashSet.add("c++"); // ��ü �ߺ� �Ұ���
		//���� ���� ����
		System.out.println("hashset�� ��ü : " + hashSet);
		System.out.println("hashset�� ��ü�� : " + hashSet.size());
		System.out.println("hashset�� ��ü ����");
		hashSet.remove("java");	// �ε��� ���� ������ ��ü �̸�
		System.out.println("hashset�� ��ü : " + hashSet);
		
		// 1. ��� �ҷ�����
		for( String string : hashSet) {
			System.out.println("��ü : " + string);
		}
		// 2. Iterator �������̽� Ȱ��
			// Iterator : ������ ���� �׸�鿡 �ϳ��� ��ȸ �������̽�
		Iterator<String> iterator = hashSet.iterator();
		
		while(iterator.hasNext()) {
						// hasNext() : ���� ��� ���� ���� [ true / false ]
			String string = iterator.next();
						// next : ���� ��� ȣ��
			System.out.println("��ü : " + string);
		}
		
		// ���� 1
		
		Scanner scanner = new Scanner(System.in);
		
		HashSet<Integer> set = new HashSet<>();
		
		for ( int i = 0 ; i<6 ; i++) {
			int num = scanner.nextInt();
					if (set.contains(num)) {
						System.out.println("�ߺ���");
						i--;
					}
			set.add(num);
		}
		System.out.println(set);
		
		
		
		
		
	}
}
