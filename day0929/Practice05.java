//���� �λ���� ���̸� �Է¹޾� �λ�� ��� 20���̻����� �Ǻ��Ͽ� �޼��� ���
//(��. ��Ʈ�����ڸ� ���������ڷ� �̿�)

import java.util.Scanner;
class Practice05
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int age1,age2;
		System.out.print("A�� ���̴�?==>");
		age1 = sc.nextInt();
		System.out.print("B�� ���̴�?==>");
		age2 = sc.nextInt();

		if(age1 >=20 & age2 >=20 )
			System.out.println("�λ�� ��� 20�� �̻��Դϴ�.");
		else
			System.out.println("�λ�� ��� 20�� �̻��� �ƴմϴ�.");
	}

} 