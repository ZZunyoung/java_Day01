package Day02;

import java.util.Scanner;

public class Day02_���� {
	public static void main(String[] args) {
		
		/* ����1 :  1���� ȸ������ ǥ ����� 
		  ����) ���̵�[S] , ��й�ȣ[short] , ����[S] , �̸���[S]  �Է¹޾� ����ϱ�
				
		  ���) 
				//  >>>>>>>>>> ȸ������ �Ϸ� �Ʒ� ������ Ȯ�����ּ��� >>>>>>>>>
				// ���̵�		��й�ȣ		����		�̸���		
				//	qwe		1234		���缮	itdanja@kakao.com
		 */
		
		/* ����2 : �޿� ���� 
		 * [ ���� ] �Է¹ޱ� : �⺻�� , ���� 
		 * [ ��� ] �Ǽ��ɾ� = �⺻�� + ���� - ����[ �⺻��10% ]
		 */
	
		//����3 : �ϳ��� ������ �Է¹޾� 7�� ������� Ȯ�� => T Ȥ�� F ���  
		//����4 : �ϳ��� ������ �Է¹޾� Ȧ�� ���� Ȯ�� 
		//����5 : �ϳ��� ������ �Է¹޾� 7�� ��� �̸鼭 ¦�� ���� Ȯ�� 
		//����6 : �ΰ��� ������ �Է¹޾� �� ū�� Ȯ�� 
		//����7 : �������� �Է¹޾� �� ���� ����ϱ�
			// �� ���� ���� => ������ * ������ * ������[3.14]
		//����8 : �� �Ǽ��� �Է¹޾� �սǼ��� ���� ���� ���� ��% ���� ����ϱ�
			// ��) 54.5   84.3 �̸�    64.285714%
		//����9 : ��ٸ��� ���� ���ϱ�[������ �غ� ���̸� �Է¹޾� ����ϱ�	
			// ��ٸ��� ���� = > (���� * �غ�) * ���� / 2
		//����10 : Ű�� ������ �Է¹޾� ǥ��ü�� ����ϱ�
			// ǥ��ü�� ���� = > (Ű - 100) * 0.9
		
		//����11 :  Ű�� �����Ը� �Է¹޾� BMI ����ϱ�
		//	//BMI ���� = > ������ / ((Ű / 100) * (Ű / 100))

		//����11 : inch �� �Է¹޾� cm �� ��ȯ�ϱ�
		
		//����12 : �߰����, �⸻���, �����򰡸� �Է¹޾� �ݿ������� ����Ͽ�
			// �Ҽ� ��° �ڸ� ���� ���� ����ϱ�
			// �߰���� �ݿ����� => 30 %
			// �⸻��� �ݿ����� => 30 %
			// ������ �ݿ����� => 40 %
		
		//����13: ���� ���� ���� �ϰ� x�� y�� �����ϱ�
			// int x = 10;
			// int y = x-- + 5 + --x;
			// printf(" x�� �� : %d , y�ǰ� :  %d ", x, y)
		
		
		//����1
		Scanner scan = new Scanner(System.in);
//		System.out.print("���̵� : ");
//		String id = scan.next();
//		System.out.print("��й�ȣ : ");
//		short pass = scan.nextShort();
//		System.out.print("���� : ");
//		String name = scan.next();
//		System.out.print("�̸��� : ");
//		String email = scan.next();
//		
//		System.out.println(">>>>>>>>>ȸ������ �Ϸ� �Ʒ� ������ Ȯ�����ּ���>>>>>>>>>");
//		System.out.println("���̵�\t��й�ȣ\t����\t�̸���");
//		System.out.println(id + "\t"+pass+"\t"+name+"\t"+email+"\n\n");
		
		//����2
//		System.out.print("�⺻�� : ");
//		int nomal = scan.nextInt();
//		System.out.print("���� : ");
//		int bonus = scan.nextInt();
//		System.out.println("�Ǽ��ɾ� : " +((nomal*0.9)+bonus) +"��\n\n");
		
		//����3
//		System.out.print("���� �Է� : ");
//		int a = scan.nextInt();
//		System.out.println(a+"�� 7�� ��� : "+(a%7==0));
		
		//����4
//		System.out.print("���� �Է� : ");
//		int b = scan.nextInt();
//		System.out.println(b+"�� Ȧ�� : "+(b%2==1));
		
		//����5
//		System.out.print("���� �Է� : ");
//		int c = scan.nextInt();
//		System.out.println(c+"�� 7�� ����̸鼭 ¦�� : "+((c%7==0)&&(c%2==0)));
		
		//����6
//		System.out.print("����1 �Է� : ");
//		int d = scan.nextInt();
//		System.out.print("����2 �Է� : ");
//		int e = scan.nextInt();
//		System.out.println("����1 > ����2 : " + (d>e));
		
		//����7
//		System.out.print("������ �Է� : ");
//		float r = scan.nextFloat();
//		System.out.println("�� ���� : " + (r*r*3.14));
		
		//����8
//		System.out.print("�Ǽ�1 �Է� : ");
//		float f = scan.nextFloat();
//		System.out.print("�Ǽ�2 �Է� : ");
//		float g = scan.nextFloat();
//		System.out.println(f/g*100+"%");
		
		//����9
//		System.out.print("���� �Է� : ");
//		float top = scan.nextFloat();
//		System.out.print("�غ� �Է� : ");
//		float base = scan.nextFloat();
//		System.out.print("���� �Է� : ");
//		float hight = scan.nextFloat();
//		System.out.println("��ٸ��� ���� : "+((top+base)*hight/2));
		
		//����10
//		System.out.print("Ű : ");
//		int high = scan.nextInt();
//		System.out.println("ǥ��ü�� : " + ((high-100)*0.9));
		
		//����11
//		System.out.print("��ġ �Է� : ");
//		float cm = scan.nextFloat();
//		System.out.println(cm + "inch�� " + cm*2.54 +"cm");
		
		//����12
//		System.out.print("�߰���� ���� : ");
//		float ce = scan.nextFloat();
//		System.out.print("�⸻��� ���� : ");
//		float fe = scan.nextFloat();
//		System.out.print("������ ���� : ");
//		float se = scan.nextFloat();
//		System.out.printf("�� ���� : %.2f" , ((ce*0.3)+(fe*0.3)+(se*0.4)));
		
		//����13
//		int x = 10;
//		int y = x-- + 5 + --x;
//		System.out.printf("x�� �� : %d , y�� �� : %d", x,y);
				

		
		
		
	}
}
