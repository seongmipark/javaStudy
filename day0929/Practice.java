//����) ��������� �ΰ��� ������ �Է¹޾� �� �߿� ���� ���� ã�� ���

import java.util.Scanner;
class Practice
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("����a�� �Է��ϼ���==>");
		a = sc.nextInt();
		System.out.print("����b�� �Է��ϼ���==>");
		b = sc.nextInt();

		if(a>b)
			System.out.println("���� ����"+b+"�Դϴ�");
		else
			System.out.println("���� ����"+a+"�Դϴ�");
	}
}
