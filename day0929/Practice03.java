//����)�л��� �̸�,����,����,������ �Է¹޾� ���������� 90�� �̻��̰�, ��������� 90�� �̻��̸�
//���б��� �����Ϸ����Ѵ�. ���б� ���ݿ��θ� �Ǻ��ϴ� ���α׷� �ۼ�.


import java.util.Scanner;
class Practice03
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
		avg = (double)tot/3;

		if(kor>=90 && avg>=90)
			System.out.println("���б� ���� ������Դϴ�.");
		else
			System.out.println("���б� ���� ����ڰ� �ƴմϴ�.");
	}
}
