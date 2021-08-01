package Day13;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Properties;

public class Day13_3 {

	public static void main(String[] args) {
	
		// Map : < Ű, �� > ���� �̷���� �ѽ� = ��Ʈ��
			// �ε��� ����
			// 1. HashMap ����ȭ x 2. HashTable ����ȭ o
			// �޼ҵ�
				// 1. .put(Ű,��) : ��Ʈ�� �߰�
				// 2. .get(Ű) : Ű�� �ش��ϴ� �� ȣ��
				// 3. .remove(Ű) : Ű�� �ش��ϴ� Ű/��[��Ʈ��] ����
				// 4. .keySet() : ���Ű�� ����Ʈ�� ��ȯ
				// 5. .values() : ��� ���� ����Ʈ�� ��ȯ
				// 6. .size() : ��Ʈ�� ��
				// 7. .clear() : ��� ��Ʈ�� ����
		
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
		
		// 1. HashTable ����
		Hashtable<String, Integer> hashtable = new Hashtable<>();
		hashtable.put("���缮", 80);
		hashtable.put("��ȣ��", 70);
		hashtable.put("�ŵ���", 60);
		hashtable.put("���缮", 80); // ������ Ű�� �ߺ� �Ұ��� [ key = �ߺ� �Ұ��� ]
		hashtable.put("������", 80); // ������ ���� �ߺ� ���� [ value = �ߺ� ���� ]
		
		System.out.println("hashtable ��� : " + hashtable);
		
		
		
		

	}
}
