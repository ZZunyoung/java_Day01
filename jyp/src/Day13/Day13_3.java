package Day13;

import java.util.HashMap;

public class Day13_3 {

	public static void main(String[] args) {
	
		// Map : < Ű, �� > ���� �̷���� �ѽ� = ��Ʈ��
			// �ε��� ����
			// 1. HashMap 2. HashTable
			// �޼ҵ�
				// 1. .put(Ű,��) : ��Ʈ�� �߰�
		
		// 1. HashMap ����
		HashMap<String, Integer> hashMap = new HashMap<>();
			// ��Ƽ���׸� : String, Integer Ŭ������ HashMap ��ü ����
		
		// �޼ҵ�
		hashMap.put("���缮", 80);
		hashMap.put("��ȣ��", 70);
		hashMap.put("�ŵ���", 60);
		
		System.out.println("hashMap ��� : " + hashMap);
		System.out.println("hashMap ��ü[��Ʈ��] �� : " + hashMap.size());
		System.out.println("hashMap ȣ�� : " + hashMap.get("��ȣ��"));
		System.out.println("hashMap ����");
		hashMap.remove("��ȣ��");
		System.out.println("hashMap ��� : " + hashMap);
		
		System.out.println("hashMap�� ��� Ű : " + hashMap.keySet());
		System.out.println("hashMap�� ��� �� : " + hashMap.values());
		
		for (String key : hashMap.keySet()) {
			System.out.println(hashMap.get(key));
		}
		hashMap.clear();
		System.out.println("hashMap ��� : " + hashMap);
		

	}
}
