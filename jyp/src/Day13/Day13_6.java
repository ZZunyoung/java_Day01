package Day13;

import java.util.Stack;

public class Day13_6 {

	public static void main(String[] args) {
		
	
	// ���� [ Stack ] : LIFO [Last in First out ] : ���Լ���
		// ���������� �Էµ� �����Ͱ� ���� ���
		// ���� ������ ����
		// ��) ���λ���, �ڷΰ��� ��
		// �޼ҵ� : Vector Ŭ������ ����
				// 1. .push(��ü) : ��ü �߰�
				// 2. .pop(��ü) : ��ü ����
		
	
	// ť [ Queue ] : FIFO [ First in First Out ] : ���Լ���
		// ���� �Էµ� ������ ���� ���
		// �Ա����� ��� ���� ����
		// ��) �ټ����, ����ö ��
	
	// ��1 ) ���� [ ����Ŭ���� ] <------- Vector [ ����Ŭ���� ]
	Stack< ���� > �������� = new Stack<>();
	
	��������.push(new ����(100));
	��������.push(new ����(200));
	��������.push(new ����(300));
	
	System.out.println("stack ȣ�� : " + ��������);
	System.out.println("stack ��ü �� :" + ��������.size());
	
	for (���� temp : ��������) {
		System.out.println(temp);
		System.out.println(temp.����);
	}
	// ����
	��������.pop(); // ���� [ ���������� ���� ������ ������ ����
	for (���� temp : ��������) {
		System.out.println(temp);
		System.out.println(temp.����);
	}

	
	
	
	
	
	
	
	}
	
	
	
}
