//����) �л��� �̸�,����,����,������ �Է¹޾� ������ ����� ���Ͽ� ����ϰ� ����� 60�� �̻��̸�
//�հ�,�׷��������� ���հ�. (�� ����� �Ǽ������� ó��)


import java.util.Scanner;
class Practice01
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor,eng,math,tot;
		double avg;

		System.out.print("�̸��� �Է��ϼ���==>");
		name = sc.next();
		System.out.print("���������� �Է��ϼ���==>");
		kor = sc.nextInt();
		System.out.print("���������� �Է��ϼ���==>");
		eng = sc.nextInt();
		System.out.print("���������� �Է��ϼ���==>");
		math = sc.nextInt();

		tot = kor + eng + math;
		avg = (double)tot/3; //avg�� �Ǽ���, tot�� 3�� �����̱⶧���� tot or 3�� �ϳ� �Ǽ��ιٲ��ش�.
		//avg = tot/3.0; 
			
			System.out.println("�̸�:"+name);
			System.out.println("����:"+kor);
			System.out.println("����:"+eng);
			System.out.println("����:"+math);
			System.out.println("����:"+tot);
			System.out.println("���:"+avg);

		if(avg>=60)
			System.out.println("�հ��Դϴ�.");
		else
			System.out.println("���հ��Դϴ�.");
	}
}