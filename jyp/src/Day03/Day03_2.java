package Day03;

import java.util.Scanner;

public class Day03_2 {
	
	// ��� : ����� ���� �Ǵܷ� 
		// if [���˻�] , switch[ �� �˻� ] 
	public static void main(String[] args) {
//		// if ���� 
//			// ���࿡ ~ �̸� 
//			// 1. if (T / F ) ���๮;
//			// 2. if (T / F ) T���๮;
//			// 		else F���๮;
//			// 3. if( T/F ) {���๮; ���๮2; }
//			// 		else { ���๮; ���๮2}
//			// 4. if(T / F) ���๮[T1]
//		//��1
//		if (5 >3) 
//			System.out.println("5�� ũ��.");
//		if(5>10)
//			System.out.println("5�� ũ��2");
//		
//		if(5>3) 
//			System.out.println("5�� ũ��3 ");
//		else 
//			System.out.println("5�� �� �۴�3");
//		if(5>3) {
//			System.out.println("true");
//			System.out.println("5�� ũ��. ");
//		}
//		else {
//			System.out.println("false");
//			System.out.println("5�� �۴�.");
//		}
//		
//		
//		if (5>10)
//			System.out.println("5�� ũ��1");
//		else if (5>8) 
//			System.out.println("5�� ũ��2");
//		else if (5>6)
//			System.out.println("5�� ũ��3");
//		else if (5>4)
//			System.out.println("5�� ũ��4");
//		else
//			System.out.println("5���� ���� �����Ͱ� ���� ");
//		
		// ����1: �ϳ��� ������ �Է¹޾� 80�� �̻��̸� �հ� �ƴϸ� ���հ� ��� 
//		Scanner sc = new Scanner(System.in);
//		int a;
//		System.out.print("�ϳ��� ������ �Է����ּ��� :");
//		a = sc.nextInt();
//		if (a>80) {
//			System.out.println("�հ��Դϴ�.");
//		}
//		else 
//			System.out.println("���հ��Դϴ�.");
		// ����2: �ϳ��� ������ �Է¹޾� 90�� �̻��̸� A 80���̻��̸� B �׿� Ż�� 
//		int b;
//		System.out.print("�ϳ��� ������ �Է����ּ��� :");
//		b = sc.nextInt();
//		if ( b>=90)
//			System.out.println("A�Դϴ�.");
//		else if(b>=80&&b<90)
//			System.out.println("B�Դϴ�");
//		else 
//			System.out.println("Ż���Դϴ�.");
		// ����3: �ϳ��� ������ ������ �Է¹޾�
			// �����̸鼭 90�� �̻��̸� A-1 Ŭ���� ��� 
			// �����̸鼭 90�� �̻��̸� A-2 Ŭ���� ��� 
				// �����̸鼭 80�� �̻��̸� B-1 Ŭ���� ���
				// �����̸鼭 80�� �̻��̸� B-2 Ŭ���� ��� 
				// �� �� C Ŭ����
		//���� 3�� Ǯ�� 
//		int a;
//		String name;
//		System.out.print("������ �Է��ϼ���");
//		a = sc.nextInt();
//		System.out.print("������ �Է��ϼ���");
//		name = sc.next();
//		if (name.equals("����")&& a>=90)
//			System.out.println("A-1Ŭ���� �Դϴ�.");
//		else if (name.equals("����")&& a>=90)
//			System.out.println("A-2Ŭ���� �Դϴ�.");
//		else if (name.equals("����")&& a>=80 && a<90 )
//			System.out.println("B-1Ŭ���� �Դϴ�.");
//		else if (name.equals("����")&& a>=80 && a<90)
//			System.out.println("B-2Ŭ���� �Դϴ�.");
//		else 
//			System.out.println("CŬ���� �Դϴ�.");
		
		//����4�� : 2���� ������ �Է¹޾� ���� ū �� ��� 
		//Ǯ��
//		int a ,b;
//		System.out.print("�ΰ��� ������ �Է����ּ���:");
//		a = sc.nextInt();
//		b = sc.nextInt();
//		if (a>b)
//			System.out.println(a+" �� �� Ů�ϴ�.");
//		else if (b>a)
//			System.out.println(b + "�� �� Ů�ϴ�");
		
		//����5�� : 3���� ������ �Է¹޾� ���� ū�� ��� < ������ ���������� max�� ���� ȿ�������� Ǫ�°� �� ����. >
		//Ǯ�� 
//		int a,b,c;
//		int max=0;
//		System.out.print("3���� ������ �Է����ּ���:");
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = sc.nextInt();
//		if (max < a) {
//			max = a;
//		}
//		if (max < b) {
//			max = b;
//		}
//		if (max < c) {
//			max = c;
//		}
//		System.out.println(max);
		//���� 6��: 4�� ������ �Է¹޾� ���� ū�� ��� 
		//���Ƿ� ù��° ������ max�� ����.
		// ififif �ϰ� if else if else if �� �������� �˾ƾ��Ѵ�. ���ڴ� tf�� ������� �ι�° ����° if �ȿ� �ִ� ���嵵 ��������� ���ڴ� 
		//���ǿ� �´��ϳ��� ����Ǹ� �� �ڴ� ������� �ʴ´�. 
		//Ǯ��
//		int a,b,c,d;
//		int max = a
//		System.out.print("4���� ������ �Է����ּ���:");
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = sc.nextInt();
//		d = sc.nextInt();
//		if (max < b) {
//			max = b;
//		}
//		if (max < c) {
//			max = c;
//		}
//		if (max <d) {
//			max = d;
//		}
//		System.out.println(max);
		
		//����7: 3�� ������ �Է¹޾� �������� ������ ��� 
//		int a,b,c;
//		int temp;// ��ü�� �ӽ� ���� 
//		int max = 0;
//		System.out.print("3���� ������ �Է����ּ���:");
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = sc.nextInt();
//		
//		System.out.printf("���� �� :%d %d %d", a,b,c);
//		if(a > b) {
//			temp = a;
//			a = b;
//			b = temp;
//		}
//		if(a > c) {
//			temp = a;
//			a = c;
//			c = temp;
//		}
//		if( b>c) {
//			temp = b;
//			b = c;
//			c = temp;
//		}
//		System.out.printf("���� �� : %d %d %d ",a,b,c);
		
		
		// ����8: 3���� ������ �Է¹޾� �������� ���� �� ���  ���������� ���������� �ε�ȣ�� �ݴ�� �ϸ� �ȴ� (�񱳴��� ũ�⸦ ���Ͽ� ��ü �ϴ� ���� �߿�)
		// swap �ϴ� ��� 
		// Ǯ�� 
//		int a,b,c;
//		int temp;// ��ü�� �ӽ� ���� 
//		int max = 0;
//		System.out.print("3���� ������ �Է����ּ���:");
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = sc.nextInt();
//		
//		System.out.printf("���� �� :%d %d %d", a,b,c);
//		if(a < b) {
//			temp = a;
//			a = b;
//			b = temp;
//		}
//		if(a < c) {
//			temp = a;
//			a = c;
//			c = temp;
//		}
//		if( b<c) {
//			temp = b;
//			b = c;
//			c = temp;
//		}
//		System.out.printf("���� �� : %d %d %d ",a,b,c);
//		
		
		
		
	}
}