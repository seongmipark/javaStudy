//���� ����ڿ��� �ΰ��� ������ �Է¹޾� ���߿� ��������ã�� ����ϴ� ���α׷��� ���׿����ڸ� �̿��Ͽ� �ۼ�

import java.util.Scanner;
class Practice06
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a,b,min;
		System.out.print("���� a�� �Է��ϼ���==>");
		a = sc.nextInt();
		System.out.print("���� b�� �Է��ϼ���==>");
		b = sc.nextInt();
		min = (a<b)?a:b;

		System.out.println("�������� "+min+"�Դϴ�.");

	}

} 