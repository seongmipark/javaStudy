//����)�λ���� ���̸� �Է¹޾� ���� ������ �Ǻ��Ͽ� ������ �޼����� ���.

import java.util.Scanner;
class Practice02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int age1,age2;

		System.out.print("A�� ���̴�?==>");
		age1 = sc.nextInt();
		System.out.print("B�� ���̴�?==>");
		age2 = sc.nextInt();

		if(age1 == age2)
			System.out.println("�λ���� ���̴� �����ϴ�.");
		else
			System.out.println("�λ���� ���̴� �ٸ��ϴ�.");
	}
}
